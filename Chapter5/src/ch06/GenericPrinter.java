package ch06;

public class GenericPrinter<T> {
	
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
