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
		
		//loadClass 에서 throws 처리한 예외에대한 처리를 호출한 쪽에서 해야한다.
		try {
			test.loadClass("a.txt", "abc");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			//default exception 처리
		}
	}

}
