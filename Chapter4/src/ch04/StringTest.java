package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {

		//Class 클래스를 이용한 클래스 동적 로딩
		Class c = Class.forName("java.lang.String");
		
		Constructor[] cons = c.getConstructors();
		for(Constructor co : cons) {
			System.out.println(co);
		}
		
		Method[] m = c.getMethods();
		for(Method mth : m) {
			System.out.println(mth);
		}
	}

}
