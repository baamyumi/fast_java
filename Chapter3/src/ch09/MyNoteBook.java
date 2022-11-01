package ch09;

public class MyNoteBook extends NoteBook {
	//NoteBook에서 override하지 않았던 typing 메서드를 override한다.
	@Override
	public void typing() {
		System.out.println("MyNoteBook typing");		
	}

}
