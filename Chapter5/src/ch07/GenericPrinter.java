package ch07;

public class GenericPrinter<T extends Material> {
	//T�� ������ Ŭ������ �� �� ����
	
	private T material;
	//static�� ���Ұ�

	public T getMaretial() {
		return material;
	}

	public void setMaretial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}
}
