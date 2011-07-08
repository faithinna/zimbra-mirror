﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using CssLib;
using System.Threading;
using MVVM;
using System.IO;
using System.ComponentModel;

namespace ZimbraMigrationConsole
{
    class Program
    {
        static void Main(string[] args)
        {

            
            if (File.Exists(@"C:\Temp\ZimbraAdminOverView.xml") && File.Exists(@"C:\Temp\UserMap.csv"))
            {

                XmlConfig myXmlConfig = new XmlConfig(@"C:\Temp\ZimbraAdminOverview.xml", @"C:\Temp\UserMap.csv");

                myXmlConfig.InitializeConfig();

                myXmlConfig.GetUserList();
                if (myXmlConfig.UserList.Count > 0)
                {
                    foreach (MVVM.Model.Users user in myXmlConfig.UserList)
                    {
                        Account userAcct = new Account();

                        System.Console.WriteLine();
                        ProgressUtil.RenderConsoleProgress(30, '\u2591', ConsoleColor.Green, "Connecting to to Zimbra Server \n   ");
                        System.Console.WriteLine();

                        ZimbraAPI zimbraAPI = new ZimbraAPI();

                        int stat = zimbraAPI.Logon(myXmlConfig.ConfigObj.zimbraServer.HostName, myXmlConfig.ConfigObj.zimbraServer.Port, myXmlConfig.ConfigObj.zimbraServer.AdminAccount, myXmlConfig.ConfigObj.zimbraServer.AdminPassword, true);
                        if (stat != 0)
                        {
                            zimbraAPI.LastError.Count();
                           
                            System.Console.WriteLine();
                            ProgressUtil.RenderConsoleProgress(30, '\u2591', ConsoleColor.Red, "Logon to to Zimbra Server  for adminAccount failed " + myXmlConfig.ConfigObj.zimbraServer.AdminAccount );
                            System.Console.WriteLine("......... \n");
                            System.Console.WriteLine();
                            Thread.Sleep(2000);
                            return;
                        }

                        userAcct.InitializeMigration(myXmlConfig.ConfigObj.zimbraServer.HostName, myXmlConfig.ConfigObj.zimbraServer.Port, myXmlConfig.ConfigObj.zimbraServer.AdminAccount);


                        string acctName = user.UserName + '@' + myXmlConfig.ConfigObj.UserProvision.Domain;
                        if (zimbraAPI.GetAccount(acctName) == 0)
                        {
                           
                            System.Console.WriteLine();
                            System.Console.WriteLine();
                            ProgressUtil.RenderConsoleProgress(30, '\u2591', ConsoleColor.Green, " Migration to Zimbra Started  for UserAccount " + user.UserName);
                            System.Console.WriteLine();
                            System.Console.WriteLine();

                            userAcct.StartMigration(user.UserName, myXmlConfig.ConfigObj.importOptions.Mail.ToString());
                            Thread.Sleep(9000);
                        }
                        else
                        {

                            System.Console.WriteLine();
                            ProgressUtil.RenderConsoleProgress(30, '\u2591', ConsoleColor.Yellow, " User is not provisioned on Zimbra Server " + user.UserName);
                           
                            System.Console.WriteLine();
                            System.Console.WriteLine();
                           
                            ProgressUtil.RenderConsoleProgress(30, '\u2591', ConsoleColor.Green, " Provisioning user" + user.UserName);
                            System.Console.WriteLine();
                            System.Console.WriteLine();

                            if (zimbraAPI.CreateAccount(acctName, myXmlConfig.ConfigObj.UserProvision.DefaultPWD, myXmlConfig.ConfigObj.UserProvision.COS) == 0)
                            {
                                
                                System.Console.WriteLine();
                                ProgressUtil.RenderConsoleProgress(30, '\u2591', ConsoleColor.Green, " Provisioning useraccount success " + user.UserName);
                                
                                System.Console.WriteLine();
                                System.Console.WriteLine();
                                ProgressUtil.RenderConsoleProgress(30, '\u2591', ConsoleColor.Green, " Migration to Zimbra Started  for UserAccount  " + user.UserName);
                                System.Console.WriteLine();
                                System.Console.WriteLine();
                                userAcct.StartMigration(user.UserName, myXmlConfig.ConfigObj.importOptions.Mail.ToString());
                                System.Console.WriteLine("......... \n");
                                Thread.Sleep(9000);
                            }
                            else
                            {
                                
                                System.Console.WriteLine();
                                
                                ProgressUtil.RenderConsoleProgress(30, '\u2591', ConsoleColor.Red, " error provisioning user " + user.UserName);
                                System.Console.WriteLine();
                                System.Console.WriteLine();
                            }



                        }

                    }
                }
                else
                {
                    System.Console.WriteLine();
                    ProgressUtil.RenderConsoleProgress(30, '\u2591', ConsoleColor.Red, " There are no user accounts to be migrated in the usermap file \n");
                    System.Console.WriteLine();
                }
            }
            else
            {
             
                System.Console.WriteLine();
                ProgressUtil.RenderConsoleProgress(30, '\u2591', ConsoleColor.Red, " There are no configuration or usermap files.make sure the xml and CSV files are at temp folder \n");
                System.Console.WriteLine();

            }
             //Thread.Sleep(18000);
           
           
        }
         
        }
           
         



        }
 

