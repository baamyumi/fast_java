package ch09;
//추상메서드 display는 override 했지만 typing은 override하지 않았기대문에 추상클래스가 된다.
public abstract class NoteBook extends Computer{

	@Override
	public void display() {
		System.out.println("NoteBook display");		
	}

}
