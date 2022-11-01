package ch07;

public class GenericPrinter<T extends Material> {
	//T에 무작위 클래스가 들어갈 수 없게
	
	private T material;
	//static은 사용불가

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
