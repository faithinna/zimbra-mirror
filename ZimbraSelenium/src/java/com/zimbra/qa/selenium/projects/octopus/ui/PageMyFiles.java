/**
 * 
 */
package com.zimbra.qa.selenium.projects.octopus.ui;

import com.zimbra.qa.selenium.framework.ui.*;
import com.zimbra.qa.selenium.framework.util.*;
import com.zimbra.qa.selenium.projects.octopus.ui.DialogError;
import com.zimbra.qa.selenium.projects.octopus.ui.DialogError.DialogErrorID;

public class PageMyFiles extends AbsTab {

	public static class Locators {
		public static final Locators zTabMyFiles = new Locators(
				"css=div.octopus-tab-label:contains(My Files)");
		public static final Locators zMyFilesCurrentMenuLabel = new Locators(
				"css=span[class*=my-files-menu-bar-current-folder-label]:contains(My Files)");
		public static final Locators zTabMyFilesSelected = new Locators(
				"css=div[class^=octopus-tab sc-collection-item sel]>div.octopus-tab-label:contains(My Files)");
		public static final Locators zMyFilesView = new Locators(
				"css=div[id=octopus-myfiles-view]");
		public static final Locators zMyFilesArrowButton = new Locators(
				"css=span[class*='my-files-list-item-action-button myfiles-button']");
		public static final Locators zNewFolderOption = new Locators(
				"css=div[class^='octopus-template-context-menu-item action-new-folder']:contains('New Folder')");
		public static final Locators zMyFilesListView = new Locators(
				"css=div[class*=my-files-list-view]");
		public static final Locators zMyFilesListViewItems = new Locators(
				"css=div[class*=my-files-list-view]>div[class^=my-files-list-item]");
		public static final Locators zShareItem = new Locators(
				"css=div[class^=sc-view sc-menu-item] a[class=menu-item]>span:contains(Share)");
		public static final Locators zFavoriteItem = new Locators(
				"css=div[class^=sc-view sc-menu-item] a[class=menu-item]>span:contains(Favorite)");
		public static final Locators zNotFavoriteItem = new Locators(
				"css=div[class^=sc-view sc-menu-item] a[class=menu-item]>span:contains('Not Favorite')");
		public static final Locators zDownloadItem = new Locators(
				"css=div[class^=sc-view sc-menu-item] a[class=menu-item]>span:contains(Download)");
		public static final Locators zRenameItem = new Locators(
				"css=div[class^=sc-view sc-menu-item] a[class=menu-item]>span:contains(Rename)");
		public static final Locators zMoveItem = new Locators(
				"css=div[class^=sc-view sc-menu-item] a[class=menu-item]>span:contains(Move)");
		public static final Locators zDeleteItem = new Locators(
				"css=div[class^=sc-view sc-menu-item] a[class=menu-item]>span:contains(Delete)");
		public static final Locators zLeaveThisSharedFolder = new Locators(
				"css=div[class^=sc-view sc-menu-item] a[class=menu-item]>span:contains('Leave this Shared Folder')");
		public static final Locators zHistory = new Locators(
				"css=div[id=my-files-preview] div[id=my-files-preview-toolbar]>button[id=show-activitystream-button])");
		public static final Locators zComments = new Locators(
				"css=div[id=my-files-preview] div[id=my-files-preview-toolbar]>button[id=my-files-preview-show-comments-button])");

		public final String locator;

		private Locators(String locator) {
			this.locator = locator;
		}
	}

	public PageMyFiles(AbsApplication application) {
		super(application);

		logger.info("new " + PageMyFiles.class.getCanonicalName());

	}

	public Toaster zGetToaster() throws HarnessException {
		return (new Toaster(this.MyApplication));
	}

	public DialogError zGetErrorDialog(DialogErrorID zimbra) {
		return (new DialogError(zimbra, this.MyApplication, this));
	}

	@Override
	public boolean zIsActive() throws HarnessException {
		// Look for the My Files tab
		boolean selected = sIsElementPresent(Locators.zMyFilesCurrentMenuLabel.locator);

		if (!selected) {
			logger.debug("zIsActive(): " + selected);
			return (false);
		}

		logger.debug("isActive() = " + true);
		return (true);
	}

	@Override
	public String myPageName() {
		return (this.getClass().getName());
	}

	@Override
	public void zNavigateTo() throws HarnessException {

		if (zIsActive()) {
			// This page is already active
			return;
		}

		// Make sure PageOctopus page is active
		if (!((AppOctopusClient) MyApplication).zPageOctopus.zIsActive()) {
			((AppOctopusClient) MyApplication).zPageOctopus.zNavigateTo();
		}

		String locator = Locators.zTabMyFiles.locator;

		if (!zWaitForElementPresent(locator, "10000")) {
			throw new HarnessException(locator + " Not Present!");
		}

		// Click on My Files tab
		zClick(locator);

		zWaitForBusyOverlay();

		zWaitForActive();
	}

	public AbsPage zToolbarPressPulldown(Button pulldown, Button option,
			String itemName) throws HarnessException {
		logger.info(myPageName() + " zToolbarPressPulldown(" + pulldown + ", "
				+ option + ")");

		tracer.trace("Click pulldown " + pulldown + " then " + option);

		if (pulldown == null)
			throw new HarnessException("Pulldown cannot be null!");

		if (option == null)
			throw new HarnessException("Option cannot be null!");

		if (itemName == null)
			throw new HarnessException("Item name cannot be null!");

		// Default behavior variables
		String pulldownLocator = null; // If set, this will be expanded
		String optionLocator = null; // If set, this will be clicked
		AbsPage page = null; // If set, this page will be returned

		if (pulldown == Button.B_MY_FILES_LIST_ITEM) {

			pulldownLocator = Locators.zMyFilesListViewItems.locator
					+ ":contains(" + itemName
					+ ") span[class^=my-files-list-item-action-button]";

			if (!this.zWaitForElementPresent(pulldownLocator, "3000"))
				throw new HarnessException("Button is not present locator="
						+ pulldownLocator);

			zClick(pulldownLocator);

			// If the app is busy, wait for it to become active
			zWaitForBusyOverlay();

			if (option == Button.B_LEAVE_THIS_SHARED_FOLDER) {
				optionLocator = Locators.zLeaveThisSharedFolder.locator;

				if (!this.zWaitForElementPresent(optionLocator, "2000"))
					throw new HarnessException("Button is not present locator="
							+ optionLocator);

				this.sClickAt(optionLocator, "0,0");

				// If the app is busy, wait for it to become active
				zWaitForBusyOverlay();

				return page;
			} else if (option == Button.O_FOLDER_SHARE) {
				optionLocator = Locators.zShareItem.locator;

				if (!this.zWaitForElementPresent(optionLocator, "2000"))
					throw new HarnessException("Button is not present locator="
							+ optionLocator);

				this.sClickAt(optionLocator, "0,0");

				// If the app is busy, wait for it to become active
				zWaitForBusyOverlay();

				page = new DialogFolderShare(MyApplication, this);

				page.zWaitForActive();

				return page;
			} else if (option == Button.O_FILE_SHARE) {
				optionLocator = Locators.zShareItem.locator;

				if (!this.zWaitForElementPresent(optionLocator, "2000"))
					throw new HarnessException("Button is not present locator="
							+ optionLocator);

				this.sClickAt(optionLocator, "0,0");

				// If the app is busy, wait for it to become active
				zWaitForBusyOverlay();

				page = new DialogFileShare(MyApplication, this);

				page.zWaitForActive();

				return page;
			} else if (option == Button.O_FAVORITE) {
				optionLocator = Locators.zFavoriteItem.locator;

				if (!this.zWaitForElementPresent(optionLocator, "2000"))
					throw new HarnessException("Button is not present locator="
							+ optionLocator);

				this.sClickAt(optionLocator, "0,0");

				// If the app is busy, wait for it to become active
				zWaitForBusyOverlay();

				return page;
			} else if (option == Button.O_NOT_FAVORITE) {
				optionLocator = Locators.zNotFavoriteItem.locator;

				if (!this.zWaitForElementPresent(optionLocator, "2000"))
					throw new HarnessException("Button is not present locator="
							+ optionLocator);

				this.sClickAt(optionLocator, "0,0");

				// If the app is busy, wait for it to become active
				zWaitForBusyOverlay();

				return page;
			} else if (option == Button.O_RENAME) {
				optionLocator = Locators.zRenameItem.locator;

				if (!this.zWaitForElementPresent(optionLocator, "2000"))
					throw new HarnessException("Button is not present locator="
							+ optionLocator);

				this.sClickAt(optionLocator, "0,0");

				// If the app is busy, wait for it to become active
				zWaitForBusyOverlay();

				return page;
			} else if (option == Button.O_MOVE) {
				optionLocator = Locators.zMoveItem.locator;

				if (!this.zWaitForElementPresent(optionLocator, "2000"))
					throw new HarnessException("Button is not present locator="
							+ optionLocator);

				this.sClickAt(optionLocator, "0,0");

				// If the app is busy, wait for it to become active
				zWaitForBusyOverlay();

				page = new DialogMove(MyApplication, this);

				return page;
			} else if (option == Button.O_DELETE) {
				optionLocator = Locators.zDeleteItem.locator;

				if (!this.zWaitForElementPresent(optionLocator, "2000"))
					throw new HarnessException("Button is not present locator="
							+ optionLocator);

				this.sClickAt(optionLocator, "0,0");

				// If the app is busy, wait for it to become active
				zWaitForBusyOverlay();

				return page;
			} else {
				logger.info("no logic defined for " + option);
			}
		} else {
			logger.info("no logic defined for " + pulldown + "/" + option);
		}

		/*
		 * // Default behavior if (pulldownLocator != null) {
		 * 
		 * // Make sure the locator exists if
		 * (!this.sIsElementPresent(pulldownLocator)) { throw new
		 * HarnessException("Button " + pulldown + " option " + option +
		 * " pulldownLocator " + pulldownLocator + " not present!"); }
		 * 
		 * zClick(pulldownLocator);
		 * 
		 * // If the app is busy, wait for it to become active
		 * zWaitForBusyOverlay(); }
		 * 
		 * if (optionLocator != null) {
		 * 
		 * // Make sure the locator exists if
		 * (!this.sIsElementPresent(optionLocator)) { throw new
		 * HarnessException(optionLocator + " not present!"); }
		 * 
		 * this.sClick(optionLocator);
		 * 
		 * // If the app is busy, wait for it to become active
		 * zWaitForBusyOverlay(); }
		 * 
		 * // If we click on pulldown/option and the page is specified, then //
		 * wait for the page to go active if (page != null) {
		 * page.zWaitForActive(); }
		 * 
		 * // Return the specified page, or null if not set
		 */
		return (page);
	}

	@Override
	public AbsPage zToolbarPressPulldown(Button pulldown, Button option)
			throws HarnessException {
		logger.info(myPageName() + " zToolbarPressPulldown(" + pulldown + ", "
				+ option + ")");

		tracer.trace("Click pulldown " + pulldown + " then " + option);

		if (pulldown == null)
			throw new HarnessException("Pulldown cannot be null!");

		if (option == null)
			throw new HarnessException("Option cannot be null!");

		// Default behavior variables
		String pulldownLocator = null; // If set, this will be expanded
		String optionLocator = null; // If set, this will be clicked
		AbsPage page = null; // If set, this page will be returned

		// Based on the button specified, take the appropriate action(s)
		if (pulldown == Button.B_MY_FILES) {
			pulldownLocator = Locators.zMyFilesArrowButton.locator;

			if (option == Button.O_NEW_FOLDER) {
				optionLocator = Locators.zNewFolderOption.locator;

				/*
				 * sGetCssCount(
				 * "css=div[class*=my-files-list-view]>div.my-files-list-item");
				 * this.zClick(Locators.zMyFilesListView.locator +
				 * ">div.my-files-list-item:last-child");
				 * this.zClick(Locators.zMyFilesListView.locator +
				 * ">div.my-files-list-item:nth-child(1)");
				 * 
				 * if (this.zWaitForElementPresent(
				 * "css=div[role=dialog]>label[class^=edit]", "3000")) { //
				 * this.sClick("css=div[role=dialog]>label[class^=edit]");
				 * zKeyEvent("css=div[role=dialog]>label[class^=edit]", "13",
				 * "keydown"); //
				 * zKeyEvent("css=div[role=dialog]>label[class^=edit]", // "13",
				 * "keyup"); }
				 * 
				 * return page;
				 */

			} else {
				logger.info("no logic defined for " + option);
			}
		} else {
			logger.info("no logic defined for " + pulldown + "/" + option);
		}

		// default behavior
		if (!this.zWaitForElementPresent(pulldownLocator, "2000"))
			throw new HarnessException("Button is not present locator="
					+ pulldownLocator);
		zClick(pulldownLocator);

		zWaitForBusyOverlay();

		if (!this.zWaitForElementPresent(optionLocator, "2000"))
			throw new HarnessException("Option is not present locator="
					+ optionLocator);
		sClick(optionLocator);

		return page;
	}

	@Override
	public AbsPage zToolbarPressButton(Button button) throws HarnessException {
		logger.info(myPageName() + " zToolbarPressPulldown(" + button + ")");

		tracer.trace("Click button " + button);

		if (button == null)
			throw new HarnessException("Pulldown cannot be null!");

		// Default behavior variables
		String pulldownLocator = null; // If set, this will be expanded
		AbsPage page = null; // If set, this page will be returned

		// Based on the button specified, take the appropriate action(s)
		if (button == Button.B_MY_FILES) {
			pulldownLocator = Locators.zMyFilesArrowButton.locator;

			zClick(pulldownLocator);

			zWaitForBusyOverlay();

		} else if (button == Button.B_HISTORY) {
			pulldownLocator = Locators.zHistory.locator;

			zClick(pulldownLocator);

			zWaitForBusyOverlay();

		} else {
			logger.info("no logic defined for " + button);
		}

		return page;
	}

	@Override
	public AbsPage zListItem(Action action, String itemName)
			throws HarnessException {
		logger.info(myPageName() + " zListItem(" + action + ", " + itemName
				+ ")");

		tracer.trace("Click list item " + itemName);

		// Validate the arguments
		if (action == null) {
			throw new HarnessException("Action cannot be null");
		}

		if (itemName == null)
			throw new HarnessException("Item name cannot be null!");

		// Default behavior variables
		String listItemLocator = null; // If set, this will be expanded
		AbsPage page = null; // If set, this page will be returned

		// Based on action and the button specified, take the appropriate
		// action(s)
		if (action == Action.A_LEFTCLICK) {

			listItemLocator = Locators.zMyFilesListViewItems.locator
					+ ":contains(" + itemName + ")";

			if (!this.zWaitForElementPresent(listItemLocator, "2000"))
				throw new HarnessException("Item is not present locator="
						+ listItemLocator);

			zClick(listItemLocator);

			page = new DisplayFilePreview(MyApplication);

			// If the app is busy, wait for it to become active
			zWaitForBusyOverlay();
		} else {
			logger.info("no logic defined for " + action);
		}

		return page;
	}

	@Override
	public AbsPage zListItem(Action action, Button button, String itemName)
			throws HarnessException {
		logger.info(myPageName() + " zListItem(" + action + ", " + button
				+ ", " + itemName + ")");

		tracer.trace("Click button " + button);

		// Validate the arguments
		if (action == null) {
			throw new HarnessException("Action cannot be null");
		}
		if (button == null)
			throw new HarnessException("Button cannot be null!");

		if (itemName == null)
			throw new HarnessException("Item name cannot be null!");

		// Default behavior variables
		String pulldownLocator = null; // If set, this will be expanded
		AbsPage page = null; // If set, this page will be returned

		// Based on action and the button specified, take the appropriate
		// action(s)
		if (action == Action.A_LEFTCLICK) {

			if (button == Button.B_MY_FILES_LIST_ITEM) {

				pulldownLocator = Locators.zMyFilesListViewItems.locator
						+ ":contains(" + itemName
						+ ") span[class^=my-files-list-item-action-button]";

				if (!this.zWaitForElementPresent(pulldownLocator, "2000"))
					throw new HarnessException("Button is not present locator="
							+ pulldownLocator);

				zClick(pulldownLocator);

				// If the app is busy, wait for it to become active
				zWaitForBusyOverlay();
			} else {
				logger.info("no logic defined for " + button);
			}
		} else {
			logger.info("no logic defined for " + action);
		}
		return page;
	}

	@Override
	public AbsPage zListItem(Action action, Button option, Button subOption,
			String item) throws HarnessException {
		throw new HarnessException("Implement me");
	}
}
