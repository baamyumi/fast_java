package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {

		/* JAVA 8���� finally�� �̿��� ���ҽ� ���� ��� */
		/*
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
			System.out.println("read");
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e.toString());
			//return;  //���ܰ� �߻��ϰ� catch���� return�� �Ѵ��ص� finally�� try�� ȣ��Ǹ� ������ ȣ��ȴ�.
			
		} finally { //���ҽ� ����
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("finally");
		}
		System.out.println("end");
		*/
		
		
		
		/* JAVA 9���� ���ҽ� ���� ��� : ���ҽ� ������ �� �ʿ���� �˾Ƽ� �������� */
		try(FileInputStream fis = new FileInputStream("a.txt")) {
			System.out.println("read");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		System.out.println("end");
	}

}
