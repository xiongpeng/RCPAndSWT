import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.layout.TreeColumnLayout;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.custom.TableCursor;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Group;


public class Demo {
	private static Table table;
	private static Table table_1;
	private static Table table_2;
	private static Table table_3;
	private static Table table_4;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display display=new Display();
		Shell shell=new Shell(display);
		shell.setSize(1023, 389);
		shell.setLayout(new FormLayout());
		Menu menu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menu);
		
		MenuItem mntmFile = new MenuItem(menu, SWT.NONE);
		mntmFile.setText("File");
		
		MenuItem mntmEdit = new MenuItem(menu, SWT.NONE);
		mntmEdit.setText("Edit");
		
		MenuItem mntmSource = new MenuItem(menu, SWT.NONE);
		mntmSource.setText("Source");
		
		MenuItem mntmNavigate = new MenuItem(menu, SWT.NONE);
		mntmNavigate.setText("Navigate");
		
		MenuItem mntmSearch = new MenuItem(menu, SWT.NONE);
		mntmSearch.setText("Search");
		
		MenuItem mntmProject = new MenuItem(menu, SWT.NONE);
		mntmProject.setText("Project");
		
		MenuItem mntmRun = new MenuItem(menu, SWT.NONE);
		mntmRun.setText("Run");
		
		MenuItem mntmWindow = new MenuItem(menu, SWT.NONE);
		mntmWindow.setText("Window");
		
		MenuItem mntmHelp = new MenuItem(menu, SWT.NONE);
		mntmHelp.setText("Help");
		
		TabFolder tabFolder = new TabFolder(shell, SWT.NONE);
		FormData fd_tabFolder = new FormData();
		fd_tabFolder.left = new FormAttachment(0, 10);
		fd_tabFolder.right = new FormAttachment(100, -670);
		fd_tabFolder.bottom = new FormAttachment(100, -10);
		fd_tabFolder.top = new FormAttachment(0, 10);
		tabFolder.setLayoutData(fd_tabFolder);
		
		TabItem tabItem = new TabItem(tabFolder, SWT.NONE);
		tabItem.setText("表");
		
		Tree tree = new Tree(tabFolder, SWT.BORDER);
		tabItem.setControl(tree);
		
		TreeItem trtmNewTreeitem = new TreeItem(tree, SWT.NONE);
		trtmNewTreeitem.setText("cn");
		
		TreeItem trtmNewTreeitem_1 = new TreeItem(trtmNewTreeitem, SWT.NONE);
		trtmNewTreeitem_1.setText("com");
		
		TreeItem trtmNewTreeitem_2 = new TreeItem(trtmNewTreeitem_1, SWT.NONE);
		trtmNewTreeitem_2.setText("test");
		
		TreeItem treeItem = new TreeItem(trtmNewTreeitem_1, SWT.NONE);
		treeItem.setText("111");
		trtmNewTreeitem_1.setExpanded(true);
		
		TreeItem treeItem_1 = new TreeItem(trtmNewTreeitem, SWT.NONE);
		treeItem_1.setText("222");
		trtmNewTreeitem.setExpanded(true);
		
		TreeItem trtmNewTreeitem_3 = new TreeItem(tree, SWT.NONE);
		trtmNewTreeitem_3.setText("222");
		
		TreeItem treeItem_3 = new TreeItem(trtmNewTreeitem_3, SWT.NONE);
		treeItem_3.setText("111");
		
		TreeItem treeItem_4 = new TreeItem(trtmNewTreeitem_3, SWT.NONE);
		treeItem_4.setText("222");
		trtmNewTreeitem_3.setExpanded(true);
		
		TreeItem treeItem_2 = new TreeItem(tree, SWT.NONE);
		treeItem_2.setText("333");
		
		TreeItem treeItem_5 = new TreeItem(treeItem_2, SWT.NONE);
		treeItem_5.setText("111");
		
		TreeItem treeItem_6 = new TreeItem(treeItem_2, SWT.NONE);
		treeItem_6.setText("222");
		treeItem_2.setExpanded(true);
		
		TabItem tabItem_2 = new TabItem(tabFolder, SWT.NONE);
		tabItem_2.setText("对象");
		
		table = new Table(tabFolder, SWT.BORDER | SWT.FULL_SELECTION);
		tabItem_2.setControl(table);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnNewColumn = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn.setWidth(54);
		tblclmnNewColumn.setText("a");
		
		TableColumn tblclmnNewColumn_1 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_1.setWidth(54);
		tblclmnNewColumn_1.setText("b");
		
		TableColumn tblclmnC = new TableColumn(table, SWT.NONE);
		tblclmnC.setWidth(100);
		tblclmnC.setText("c");
		
		TableColumn tblclmnNewColumn_2 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_2.setWidth(100);
		tblclmnNewColumn_2.setText("d");
		
		TableItem tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(new String[]{"3","2","4","1"});
		
		TableItem tableItem2 = new TableItem(table, SWT.NONE);
		tableItem2.setText(new String[]{"1","2","3","4"});
		
		TabFolder tabFolder_1 = new TabFolder(shell, SWT.NONE);
		FormData fd_tabFolder_1 = new FormData();
		fd_tabFolder_1.top = new FormAttachment(0, 10);
		fd_tabFolder_1.right = new FormAttachment(tabFolder, 453, SWT.RIGHT);
		fd_tabFolder_1.left = new FormAttachment(tabFolder, 40);
		fd_tabFolder_1.bottom = new FormAttachment(0, 170);
		tabFolder_1.setLayoutData(fd_tabFolder_1);
		
		TabItem tabItem_1 = new TabItem(tabFolder_1, SWT.NONE);
		tabItem_1.setText("EccMonitor");
		
		table_1 = new Table(tabFolder_1, SWT.BORDER | SWT.FULL_SELECTION);
		tabItem_1.setControl(table_1);
		
		
		table_1.setHeaderVisible(true);
		table_1.setLinesVisible(true);
		
		TableColumn tableColumn = new TableColumn(table_1, SWT.NONE);
		tableColumn.setWidth(100);
		tableColumn.setText("状态");
		tableColumn.setText("\u6545\u969C");
		TableColumn tblclmnNewColumn_3 = new TableColumn(table_1, SWT.NONE);
		tblclmnNewColumn_3.setWidth(100);
		tblclmnNewColumn_3.setText("名称");
		
		TableColumn tableColumn_1 = new TableColumn(table_1, SWT.NONE);
		tableColumn_1.setWidth(100);
		tableColumn_1.setText("\u63CF\u8FF0");
		
		TableColumn tableColumn_2 = new TableColumn(table_1, SWT.NONE);
		tableColumn_2.setWidth(100);
		tableColumn_2.setText("\u6700\u540E\u66F4\u65B0");
		TabItem tabItem_3 = new TabItem(tabFolder_1, SWT.NONE);
		tabItem_3.setText("变更");
		
		table_2 = new Table(tabFolder_1, SWT.BORDER | SWT.FULL_SELECTION);
		tabItem_3.setControl(table_2);
		table_2.setHeaderVisible(true);
		table_2.setLinesVisible(true);
		
		TabFolder tabFolder_2 = new TabFolder(shell, SWT.NONE);
		FormData fd_tabFolder_2 = new FormData();
		fd_tabFolder_2.right = new FormAttachment(tabFolder_1, -200, SWT.RIGHT);
		fd_tabFolder_2.bottom = new FormAttachment(tabFolder, 0, SWT.BOTTOM);
		fd_tabFolder_2.top = new FormAttachment(tabFolder_1, 6);
		fd_tabFolder_2.left = new FormAttachment(tabFolder_1, 0, SWT.LEFT);
		tabFolder_2.setLayoutData(fd_tabFolder_2);
		
		TabItem tabItem_4 = new TabItem(tabFolder_2, SWT.NONE);
		tabItem_4.setText("概要");
		
		TabItem tabItem_5 = new TabItem(tabFolder_2, SWT.NONE);
		tabItem_5.setText("相关监视器");
		
		TabItem tabItem_6 = new TabItem(tabFolder_2, SWT.NONE);
		tabItem_6.setText("日志数据");
		
		table_3 = new Table(tabFolder_2, SWT.BORDER | SWT.FULL_SELECTION);
		
		Group group = new Group(shell, SWT.NONE);
		FormData fd_group = new FormData();
		fd_group.top = new FormAttachment(tabFolder_1, 20);
		fd_group.bottom = new FormAttachment(100, -15);
		fd_group.right = new FormAttachment(tabFolder_1, 2, SWT.RIGHT);
		fd_group.left = new FormAttachment(tabFolder_2, 6);
		group.setLayoutData(fd_group);
		
		Button btnNewButton = new Button(group, SWT.NONE);
		btnNewButton.setBounds(10, 28, 53, 20);
		btnNewButton.setText("详细信息");
		
		Button btnNewButton_1 = new Button(group, SWT.NONE);
		btnNewButton_1.setBounds(69, 28, 44, 20);
		btnNewButton_1.setText("编辑");
		
		Label lblNewLabel = new Label(group, SWT.NONE);
		lblNewLabel.setBounds(10, 10, 54, 12);
		lblNewLabel.setText("详细信息");
		
		Button btnNewButton_2 = new Button(group, SWT.NONE);
		btnNewButton_2.setBounds(114, 28, 44, 20);
		btnNewButton_2.setText("删除");
		
		Label lblNewLabel_1 = new Label(group, SWT.NONE);
		lblNewLabel_1.setBounds(10, 63, 36, 12);
		lblNewLabel_1.setText("正常：");
		
		Label lblNewLabel_2 = new Label(group, SWT.NONE);
		lblNewLabel_2.setBounds(10, 81, 36, 12);
		lblNewLabel_2.setText("错误：");
		
		Label lblNewLabel_3 = new Label(group, SWT.NONE);
		lblNewLabel_3.setBounds(104, 63, 36, 12);
		lblNewLabel_3.setText("危险：");
		
		Label lblNewLabel_4 = new Label(group, SWT.NONE);
		lblNewLabel_4.setBounds(104, 81, 36, 12);
		lblNewLabel_4.setText("禁止：");
		
		Label lblNewLabel_5 = new Label(group, SWT.NONE);
		lblNewLabel_5.setBounds(56, 63, 24, 12);
		lblNewLabel_5.setText("0");
		
		Label lblNewLabel_6 = new Label(group, SWT.NONE);
		lblNewLabel_6.setBounds(56, 81, 24, 12);
		lblNewLabel_6.setText("1");
		
		Label lblNewLabel_7 = new Label(group, SWT.NONE);
		lblNewLabel_7.setBounds(146, 63, 40, 12);
		lblNewLabel_7.setText("2");
		
		Label lblNewLabel_8 = new Label(group, SWT.NONE);
		lblNewLabel_8.setBounds(146, 81, 40, 12);
		lblNewLabel_8.setText("0");
		
//		table_4.setHeaderVisible(true);
//		table_4.setLinesVisible(true);
//		table_3.setHeaderVisible(true);
//		table_3.setLinesVisible(true);
		shell.open();
		while(!shell.isDisposed()){
			if(!display.readAndDispatch()){
			   display.sleep();
			}
		}
		shell.dispose();
		

	}		
}
