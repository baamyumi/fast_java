package ch02;

public class AddTest {

	public static void main(String[] args) {

		Add addL = (x,y)-> {return x+y;};  //�Լ��� �������̽� ������ Add �Լ��� ���ٽ����� ����
		System.out.println(addL.add(2, 3));
	}

}
