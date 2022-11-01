package ch02;

public class AddTest {

	public static void main(String[] args) {

		Add addL = (x,y)-> {return x+y;};  //함수형 인터페이스 내부의 Add 함수를 람다식으로 구현
		System.out.println(addL.add(2, 3));
	}

}
