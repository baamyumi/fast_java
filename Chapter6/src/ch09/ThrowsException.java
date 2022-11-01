package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class loadClass(String fileName, String ClassName) throws ClassNotFoundException, FileNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		
		Class c = Class.forName(ClassName);
		
		return c;
	}
	
	
	public static void main(String[] args) {

		ThrowsException test = new ThrowsException();
		
		//loadClass ���� throws ó���� ���ܿ����� ó���� ȣ���� �ʿ��� �ؾ��Ѵ�.
		try {
			test.loadClass("a.txt", "abc");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			//default exception ó��
		}
	}

}
