package ch10;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�");
	}
	
	public void washCar() {} //������ �Ǿ����� ���������� ���� �޼��� > �ʿ��� ��쿡�� ����Ŭ�������� �����Ǹ� �� �� �ֵ���
	
	/*
	 * [final]
	 * class : ����� �ȵǴ� Ŭ����
	 * ���� : ���
	 * �޼��� : �����Ǹ� ���ϴ� �޼���
	 * */
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
