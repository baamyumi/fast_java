package ch13;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) {

		System.out.println("���ĺ� ���� ���� ���� ���͸� ��������");
		
		int i;
		
		/* 1.�ѱ��ھ� */
		/*
		try {
			i = System.in.read();
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		/* 2.�������� */
		try {
			while((i= System.in.read()) != '\n') {
				//System.out.println(i);
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
