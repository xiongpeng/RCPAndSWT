package cn.com.test;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class TextDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("�ı���ʾ��");
		Text txt = new Text(shell,SWT.NONE|SWT.BORDER);//�����ı������ʽ
		txt.setText("Ĭ���ı�����ʽ");
		txt.setBounds(10, 10, 70, 30);//�����ı����λ���Լ���ȡ��߶�
		
		Text txt2 = new Text(shell, SWT.PASSWORD);
		txt2.setText("123456");
		txt2.setBounds(90, 10, 70, 30);
		Text txt3 = new Text(shell, SWT.MULTI|SWT.V_SCROLL|SWT.H_SCROLL);
		txt3.setBounds(10, 50, 70, 70);
		Text txt4 = new Text(shell, SWT.WRAP|SWT.V_SCROLL);
		txt4.setBounds(90, 50, 70, 70);
		shell.pack();
		shell.open();
		while(!shell.isDisposed()){//���������û�йر���һֱѭ��
			if(display.readAndDispatch()){//���display��æ
				display.sleep();//����
			}
			
		}
		display.dispose();//����display
		
	}
	

}
