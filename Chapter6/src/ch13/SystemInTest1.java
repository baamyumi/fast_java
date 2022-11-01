package ch13;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) {

		System.out.println("알파벳 여러 개를 쓰고 엔터를 누르세요");
		
		int i;
		
		/* 1.한글자씩 */
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
		
		/* 2.여러글자 */
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
