package ch09;
//�߻�޼��带 �����ϴ� �߻� Ŭ����
public abstract class Computer {
	
	//�����ΰ� ���� �߻�޼���
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
