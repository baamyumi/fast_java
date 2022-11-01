package ch07;

public class GenericPrinterTest {

	public static void main(String[] args) {

		Powder powder = new Powder();
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>(); 
		//powder든, plastic이든 사용할 수 있다.
		//자료형을 지정하지 않으면 Object로 지정이되지만 그런 방식으로는 자주 사용하지는 않음.
		
		powderPrinter.setMaretial(powder);
		
		Powder p = powderPrinter.getMaretial();
		System.out.println(powderPrinter.toString());
		
	}

}
