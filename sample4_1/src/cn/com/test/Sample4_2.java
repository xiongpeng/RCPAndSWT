package cn.com.test;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class Sample4_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = new Display();//����һ��display����
		Shell shell = new Shell(display);//shell�ǳ��������
		//shell.setLayout(null);//����shell�Ĳ��ַ�ʽ
		shell.setText("��ťʾ��");//����������ı���
		Button bt1 = new Button(shell,SWT.NULL);//����Ĭ�ϵİ�ť
		bt1.setText("Ĭ�ϰ�ť");//���ð�ť�ϵ�����
		bt1.setBounds(10, 10, 75, 30);//���ð�ť��ʾλ�ü���ȡ��߶�
		Button bt2 = new Button(shell, SWT.PUSH|SWT.BORDER);//���������Ͱ�ť
		bt2.setText("�����Ͱ�ť");//���ð�ť�ϵ�����
		bt2.setBounds(90, 10, 75, 30);//���ð�ť����ʾλ�ü���ȡ��߶�
		Button check1 = new Button(shell, SWT.CHECK);//������ѡ��ť
		check1.setText("��ѡ��ť");
		check1.setBounds(10, 50, 75, 30);
		Button check2 = new Button(shell, SWT.CHECK|SWT.BORDER);//���������͸�ѡ��ť
		check2.setText("�����͸�ѡ��ť");
		check2.setBounds(90, 50, 75, 30);
		Button radio1 = new Button(shell, SWT.RADIO);//������ѡ��ť
		radio1.setText("��ѡ��ť");
		radio1.setBounds(10, 90, 75, 30);
		Button radio2 = new Button(shell, SWT.RADIO|SWT.BORDER);//�����͵�ѡ��ť
		radio2.setText("�����͵�ѡ��ť");
		radio2.setBounds(90, 90, 75, 30);//���ð�ť��λ���Լ���ȡ��߶�
		Button arrowLeft = new Button(shell, SWT.ARROW|SWT.LEFT);//������ͷ��ť������
		arrowLeft.setBounds(10, 130, 75, 20);//���ð�ť��λ���Լ���ȡ��߶�
		Button arrowRight = new Button(shell, SWT.ARROW|SWT.RIGHT);//������ͷ��ť�����ң�
		arrowRight.setBounds(90, 130, 75, 20);//���ð�ť��λ���Լ���ȡ��߶�
		shell.pack();//�Զ�����������Ĵ�С
		shell.open();//��������
		while(!shell.isDisposed()){//���������û�йر�
			if(!display.readAndDispatch()){//���display��æ
				display.sleep();
			}
		}
		display.dispose();
		
	}

}
