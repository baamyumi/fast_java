package ch07;

public class GenericPrinterTest {

	public static void main(String[] args) {

		Powder powder = new Powder();
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>(); 
		//powder��, plastic�̵� ����� �� �ִ�.
		//�ڷ����� �������� ������ Object�� �����̵����� �׷� ������δ� ���� ��������� ����.
		
		powderPrinter.setMaretial(powder);
		
		Powder p = powderPrinter.getMaretial();
		System.out.println(powderPrinter.toString());
		
	}

}
