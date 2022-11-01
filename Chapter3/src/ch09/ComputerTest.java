package ch09;

public class ComputerTest {

	public static void main(String[] args) {
		//추상클래스는 new 할 수 없음(인스턴스화 할 수 없음)
		Desktop desktop = new Desktop();
		desktop.display();
	}

}
