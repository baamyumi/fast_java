package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {

		/* JAVA 8까지 finally를 이용한 리소스 해제 방법 */
		/*
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
			System.out.println("read");
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e.toString());
			//return;  //예외가 발생하고 catch에서 return을 한다해도 finally는 try가 호출되면 무조건 호출된다.
			
		} finally { //리소스 해제
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
		
		
		
		/* JAVA 9부터 리소스 해제 방법 : 리소스 해제를 할 필요없이 알아서 해제해줌 */
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
