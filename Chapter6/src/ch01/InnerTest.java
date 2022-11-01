package ch01;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass(){
		inClass = new InClass();
	}
	
	//innerClass
	private class InClass{
		int iNum = 100;
		
		void inTest() {
			System.out.println("OutClass num = " +num+ "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " +sNum+ "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass iNum = " +iNum+ "(내부 클래스의 인스턴스 변수)");
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	static class InStaticClass{
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			//외부클래스의 인스턴스 변수는 스태틱 내부클래스에서 쓸 수 없다.
			System.out.println("InClass num = " +iNum+ "(내부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " +sNum+ "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass sInNum = " +sInNum+ "(내부 클래스의 스태틱 변수)");
		}
		
		static void sTest() {
			System.out.println("OutClass sNum = " +sNum+ "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass sInNum = " +sInNum+ "(내부 클래스의 스태틱 변수)");
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {

		/*
		OutClass outClass = new OutClass();
		outClass.usingClass();
		*/
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		
		System.out.println();
		
		OutClass.InStaticClass.sTest();  //정적메서드는 바로 호출 > 스태틱 변수만 사용가능
	}

}
