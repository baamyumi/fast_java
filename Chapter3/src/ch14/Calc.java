package ch14;

public interface Calc {
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	/*JAVA 8 이후 추가 된 기능 >  default */
	default void description() {
		System.out.println("정수의 사칙연산을 제공합니다.");
	}
	
	/*JAVA 8 이후 추가 된 기능 >  static */
	static int total(int[] arr) {
		int total = 0;
		for(int num : arr) {
			total += num;
		}
		myStaticMethod();
		return total;
	}
	
	/*JAVA 9 이후 추가 된 기능 > private */
	private void myMethod() {
		System.out.println("myMethod");
	}
	
	/* static */
	private static void myStaticMethod() {
		System.out.println("myStaticMethod");
	}
}
