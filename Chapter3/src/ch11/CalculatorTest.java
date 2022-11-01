package ch11;

public class CalculatorTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc();	//showInfo() 메서드 사용 불가.
		//CompleteCalc calc = new CompleteCalc(); //CompleteCalc 타입으로 선언을하면 showInfo() 메서드 사용가능.
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
	}

}
