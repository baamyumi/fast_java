package ch02;

@FunctionalInterface
public interface Add {

	//함수형 인터페이스 : 익명함수와 매게변수만으로 구현 > 인터페이스는 단 하나의 메서드만을 선언해야한다.
	public int add(int x, int y);
	
}
