package ch10;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	
	public void washCar() {} //구현은 되었으나 구현내용이 없는 메서드 > 필요한 경우에만 하위클래스에서 재정의를 할 수 있도록
	
	/*
	 * [final]
	 * class : 상속이 안되는 클래스
	 * 변수 : 상수
	 * 메서드 : 재정의를 못하는 메서드
	 * */
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
