package ch11;

public interface Calc {
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	/*
	 * [인터페이스가 하는일]
	 * 클래스나 프로그램이 제공하는 기능을 명시적으로 선언
	 * 클래스나 프로그램이 제공하는 명세
	 * 클라이언트 프로그램은 인터페이스에 선언된 메서드 명세만 보고 이를 구현한 클래스를 사용할 수 있다.
	 * */
}
