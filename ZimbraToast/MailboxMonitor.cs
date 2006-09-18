using System;
using System.Threading;
using System.Runtime.CompilerServices;

namespace Zimbra.Toast
{
	/// <summary>
	/// Monitor a mailbox for changes
	/// </summary>
	public class MailboxMonitor
	{
		//default polling interval is 5 minutes
		private static UInt16 DEFAULT_POLL_INTERVAL = 5;

		//the thread that monitors the mailbox and fires event
		private Thread monitorThread = null;

		private AutoResetEvent wakeEvent = null;

		//the zimbra client session
		private ZimbraSession zimbraSession = null;

		//how often to check for new items on the server (minutes)
		private UInt16 pollInterval = DEFAULT_POLL_INTERVAL;

		/// <summary>
		/// Handle new message notifications
		/// </summary>
		public delegate void NewMsgHandler( Zimbra.Client.MessageSummary[] newMsgs, System.Threading.AutoResetEvent are );

		/// <summary>
		/// Fired when new messages have arrived on the server
		/// </summary>
		public event NewMsgHandler OnNewMsgs;


		/// <summary>
		/// Craete a mailbox monitor for the given account.  Communicate with the give server
		/// </summary>
		/// <param name="session">The zimbra sesson to use when monitoring</param>
		/// <param name="pollInterval">schedule monitoring interval</param>
		public MailboxMonitor( ZimbraSession session, UInt16 pollInterval )
		{
			wakeEvent = new AutoResetEvent(false);
			Update( session, pollInterval );
		}


		/// <summary>
		/// Update the account/server configuration.  If monitoring is in progress, it will
		/// be stopped and resarted.
		/// </summary>
		/// <param name="session">The session to use when monitoring</param>
		/// <param name="pollInterval">seconds before checking for new items on the server</param>
		[MethodImpl(MethodImplOptions.Synchronized)]
		public void Update( ZimbraSession session, UInt16 pollInterval )
		{
			bool bMonitoring = IsMonitoring();

			StopMonitoring();

			zimbraSession = session;
			this.pollInterval = pollInterval;

			if( bMonitoring )
				StartMonitoring();
		}



		/// <summary>
		/// True if the mailbox is being monitored actively
		/// </summary>
		[MethodImpl(MethodImplOptions.Synchronized)]
		public bool IsMonitoring()
		{
			return 
				( monitorThread != null && 
					( ( monitorThread.ThreadState & (ThreadState.Stopped | ThreadState.Unstarted ) ) == 0 ) );
		}


		/// <summary>
		/// Start monitoring the zimbra mailbox for new items.  
		/// If monitoring has started, it will be stopped and restarted.
		/// </summary>
		[MethodImpl(MethodImplOptions.Synchronized)]
		public void StartMonitoring()
		{
			if( monitorThread != null )
			{
				StopMonitoring();
			}

			monitorThread = new System.Threading.Thread( new System.Threading.ThreadStart(MonitorMailbox) );
			monitorThread.Start();
		}



		/// <summary>
		/// Resume monitoring the zimbra mailbox for new items.
		/// If monitoring is not paused, does nothing.
		/// </summary>
		[MethodImpl(MethodImplOptions.Synchronized)]
		public void ResumeMonitoring()
		{
			if( monitorThread != null ) 
			{
				monitorThread.Resume();
			}
		}



		/// <summary>
		/// Pause monitoring of the zimbra mailbox 
		/// </summary>
		[MethodImpl(MethodImplOptions.Synchronized)]
		public void PauseMonitoring()
		{
			if( monitorThread != null )
			{
				monitorThread.Suspend();
			}
		}


		/// <summary>
		/// Stop monitoring the zimbra mailbox
		/// </summary>
		[MethodImpl(MethodImplOptions.Synchronized)]
		public void StopMonitoring()
		{
			if( monitorThread == null  ) 
			{
				return;
			}
			monitorThread.Abort();
			monitorThread = null;
		}


		/// <summary>
		/// monitors the mailbox for new messages and fires
		/// 
		/// the toast for each new item.
		/// </summary>
		private void MonitorMailbox()
		{
			//create a timer to wake this thread up periodically
			long lSleep = pollInterval * 1000 * 60;
			System.Threading.Timer t = new Timer( new TimerCallback(SignalWorkerThread), null, lSleep, lSleep );
			while( true )
			{
				try 
				{
					CheckMailbox_Internal();
					wakeEvent.WaitOne();
				}
				catch(System.Threading.ThreadAbortException)
				{
					return;
				}
				catch(Exception e)
				{
					e.GetType();
					return;
				}
			}
		}


		/// <summary>
		/// Release the worker thread so it can check for new items on the server
		/// </summary>
		/// <param name="o"></param>
		private void SignalWorkerThread(object o)
		{
			wakeEvent.Set();
		}


		/// <summary>
		/// check the mailbox right now to see if there are any new messages
		/// can be called from any thread - request handled asynchronously
		/// </summary>
		public void CheckMailbox()
		{
			SignalWorkerThread(null);
		}


		/// <summary>
		/// check the mailbox right now to see if there are any new messages
		/// must run in the mailbox monitors worker thread
		/// </summary>
		private void CheckMailbox_Internal()
		{
			lock(this)
			{
				//check for new messages
				Zimbra.Client.MessageSummary[] msgs = zimbraSession.NewMsgs;
						
				//if we got new stuff, fire off the events
				if( msgs != null && msgs.Length > 0 ) 
				{
					int nCount = 0;
					for( int i = 0; i < msgs.Length; i++ )
					{
						if( msgs[i].parentFolderId.Equals( "2" ) )
						{
							nCount++;
						} 
						else
						{
							msgs[i] = null;
						}
					}
					
					if( nCount == 0 )
						return;

					int insLoc = 0;

					Zimbra.Client.MessageSummary[] inboxMsgs = new Zimbra.Client.MessageSummary[ nCount ];
					for( int i = 0; i < msgs.Length; i++ )
					{
						if( msgs[i] != null )
						{
							inboxMsgs[insLoc++] = msgs[i];
						}
					}

					System.Threading.AutoResetEvent are = new AutoResetEvent(false);
					OnNewMsgs( inboxMsgs, are );
					are.WaitOne();
				}
			}
		}
	}


	
}