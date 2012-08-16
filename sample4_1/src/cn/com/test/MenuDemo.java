package cn.com.test;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class MenuDemo {

	public static void main(String[] args) {
//		Display display = new Display();// ����һ��display����
//		final Shell shell = new Shell(display);// shell�ǳ����������
//		shell.setText("�˵�ʾ��");
//		Menu mainMenu = new Menu(shell, SWT.BAR);
//		shell.setMenuBar(mainMenu);
//		// Menu mainMenu=new Menu(shell,SWT.POP_UP); //��������ʽ�˵�
//		// shell.setMenu(mainMenu); //��������ʽ�˵�
//		{
//			// "�ļ�"��
//			MenuItem fileItem = new MenuItem(mainMenu, SWT.CASCADE);
//			fileItem.setText("�ļ�&F");
//			// "�ļ�"�˵�
//			Menu fileMenu = new Menu(shell, SWT.DROP_DOWN);
//			fileItem.setMenu(fileMenu);
//			{
//				// "�½�"��
//				MenuItem newFileItem = new MenuItem(fileMenu, SWT.CASCADE);
//				newFileItem.setText("�½�&N");
//				// "�½�"�˵�
//				Menu newFileMenu = new Menu(shell, SWT.DROP_DOWN);
//				newFileItem.setMenu(newFileMenu);
//				{
//					// "�½���Ŀ"��
//					MenuItem newProjectItem = new MenuItem(newFileMenu,
//							SWT.PUSH);
//					newProjectItem.setText("��Ŀ\tCtrl+Shift+N");
//					// ���ÿ�ݼ�
//					newProjectItem.setAccelerator(SWT.CTRL + SWT.SHIFT + 'N');
//					// ����¼�����
//					newProjectItem.addSelectionListener(new SelectionAdapter() {
//						public void widgetSelected(SelectionEvent e) {
//							Text text = new Text(shell, SWT.MULTI | SWT.BORDER
//									| SWT.WRAP);
//							text.setBounds(10, 10, 100, 30);
//							text.setText("��ѡ���ˡ��½���Ŀ��");
//						}
//					});
//					new MenuItem(newFileMenu, SWT.SEPARATOR);
//					new MenuItem(newFileMenu, SWT.PUSH).setText("��");
//					new MenuItem(newFileMenu, SWT.PUSH).setText("��");
//				}
//				MenuItem openFileItem = new MenuItem(fileMenu, SWT.CASCADE);
//				openFileItem.setText("��&O");
//				MenuItem exitItem = new MenuItem(fileMenu, SWT.CASCADE);
//				exitItem.setText("�˳�&E");
//			}
//			MenuItem helpItem = new MenuItem(mainMenu, SWT.CASCADE);
//			helpItem.setText("����&H");
//		}
//		shell.pack();
//		shell.open();
//		while (!shell.isDisposed()) { // ���������û�йر���һֱѭ��
//			if (!display.readAndDispatch()) { // ���display��æ
//				display.sleep(); // ����
//			}
//		}
//		display.dispose(); // ����display
		Display display = new Display();
		final Shell shell = new Shell(display);
		shell.setText("�˵�ʾ��");
		Menu mainMenu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(mainMenu);
		{
				MenuItem fileItem = new MenuItem(mainMenu, SWT.CASCADE);
				fileItem.setText("File");
				Menu fileMenu = new Menu(shell,SWT.DROP_DOWN);
				fileItem.setMenu(fileMenu);
				{
					// "�½�"��
					MenuItem newFileItem = new MenuItem(fileMenu, SWT.CASCADE);
					newFileItem.setText("�½�&N");
					// "�½�"�˵�
					Menu newFileMenu = new Menu(shell, SWT.DROP_DOWN);
					newFileItem.setMenu(newFileMenu);
					{
						// "�½���Ŀ"��
						MenuItem newProjectItem = new MenuItem(newFileMenu,
								SWT.PUSH);
						newProjectItem.setText("��Ŀ\tCtrl+Shift+N");
						// ���ÿ�ݼ�
						newProjectItem.setAccelerator(SWT.CTRL + SWT.SHIFT + 'N');
						// ����¼�����
						newProjectItem.addSelectionListener(new SelectionAdapter() {
							public void widgetSelected(SelectionEvent e) {
								Text text = new Text(shell, SWT.MULTI | SWT.BORDER
										| SWT.WRAP);
								text.setBounds(10, 10, 100, 30);
								text.setText("��ѡ���ˡ��½���Ŀ��");
							}
						});
						new MenuItem(newFileMenu, SWT.SEPARATOR);
						new MenuItem(newFileMenu, SWT.PUSH).setText("��");
						new MenuItem(newFileMenu, SWT.PUSH).setText("��");
					}
				}
				MenuItem fileItem1 = new MenuItem(mainMenu, SWT.CASCADE);
				fileItem1.setText("Edit");
				Menu fileMenu1 = new Menu(shell,SWT.DROP_DOWN);
				fileItem1.setMenu(fileMenu1);
		}
		shell.pack();
		shell.open();
		while(!shell.isDisposed()){
			if(!display.readAndDispatch()){
				display.sleep();
			}
		}
		
		
		
	}
}
