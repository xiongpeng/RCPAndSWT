package rcpdemo4;

import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ShellAdapter;
import org.eclipse.swt.events.ShellEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tray;
import org.eclipse.swt.widgets.TrayItem;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {
	private final static String COMMAND_ID = "exitCommand";
	private Image trayImage;
	private TrayItem trayItem;

	private IWorkbenchWindow window;

	public ApplicationWorkbenchWindowAdvisor(
			IWorkbenchWindowConfigurer configurer) {
		super(configurer);
	}

	public ActionBarAdvisor createActionBarAdvisor(
			IActionBarConfigurer configurer) {
		return new ApplicationActionBarAdvisor(configurer);
	}

	// We need to clean-up after ourself
	@Override
	public void dispose() {
		if (trayImage != null) {
			trayImage.dispose();
		}
		if (trayItem != null) {
			trayItem.dispose();
		}
	}

	// We hook up on menu entry which allows to close the application
	private void hookPopupMenu() {
		trayItem.addListener(SWT.MenuDetect, new Listener() {
			public void handleEvent(Event event) {
				Menu menu = new Menu(window.getShell(), SWT.POP_UP);
				// Creates a new menu item that terminates the program
				// when selected
				MenuItem exit = new MenuItem(menu, SWT.NONE);
				exit.setText("Goodbye!");
				exit.addListener(SWT.Selection, new Listener() {
					public void handleEvent(Event event) {
						// Lets call our command
						IHandlerService handlerService = (IHandlerService) window
								.getService(IHandlerService.class);
						try {
							handlerService.executeCommand(COMMAND_ID, null);
						} catch (Exception ex) {
							throw new RuntimeException(COMMAND_ID);
						}
					}
				});
				// We need to make the menu visible
				menu.setVisible(true);
			}
		});
	}

	// This methods create the tray item and return a reference
	private TrayItem initTaskItem(IWorkbenchWindow window) {
		final Tray tray = window.getShell().getDisplay().getSystemTray();
		TrayItem trayItem = new TrayItem(tray, SWT.NONE);
		trayImage = AbstractUIPlugin.imageDescriptorFromPlugin(
				"rcpdemo4", "/icons/alt_about.gif").createImage();
		trayItem.setImage(trayImage);
		trayItem.setToolTipText("TrayItem");
		return trayItem;
	}

	// Add a listener to the shell
	private void minimizeBehavior() {
		window.getShell().addShellListener(new ShellAdapter() {
			// If the window is minimized hide the window
			public void shellIconified(ShellEvent e) {
				window.getShell().setVisible(false);
			}
		});
		// If user double-clicks on the tray icons the application will be
		// visible again
		trayItem.addListener(SWT.DefaultSelection, new Listener() {
			public void handleEvent(Event event) {
				Shell shell = window.getShell();
				if (!shell.isVisible()) {
					window.getShell().setMinimized(false);
					shell.setVisible(true);
				}
			}
		});
	}

	// As of here is the new stuff
	@Override
	public void postWindowOpen() {
//		super.postWindowOpen();
//		window = getWindowConfigurer().getWindow();
//		trayItem = initTaskItem(window);
//		// Some OS might not support tray items
//		if (trayItem != null) {
//			minimizeBehavior();
//			// Create exit and about action on the icon
//			hookPopupMenu();
//		}
		IStatusLineManager statusline = getWindowConfigurer()
				.getActionBarConfigurer().getStatusLineManager();
				statusline.setMessage(null, "EveryOne is ready");
	}

	public void preWindowOpen() {
//		IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
//		configurer.setInitialSize(new Point(400, 600));
//		configurer.setShowCoolBar(false);
//		configurer.setShowStatusLine(false);
//		configurer.setTitle("Hello RCP"); //$NON-NLS-1$
		IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
		configurer.setInitialSize(new Point(400, 300));
		configurer.setShowCoolBar(false);
		configurer.setShowStatusLine(false);
		configurer.setTitle("My First RCP");
		configurer.setShowStatusLine(true);
	}

}
