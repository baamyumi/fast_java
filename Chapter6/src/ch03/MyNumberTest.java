package ch03;

public class MyNumberTest {

	public static void main(String[] args) {

		MyNumber myNumber = (x,y) -> x > y ? x : y;
		System.out.println(myNumber.getNax(10, 20));
	}

}
