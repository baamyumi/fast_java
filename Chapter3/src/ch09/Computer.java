package ch09;
//추상메서드를 포함하는 추상 클래스
public abstract class Computer {
	
	//구현부가 없는 추상메서드
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
