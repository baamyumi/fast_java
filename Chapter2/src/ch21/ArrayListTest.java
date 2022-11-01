package ch21;

import java.util.ArrayList;

public class ArrayListTest extends ObjectCopyTest {

	public static void main(String[] args) {
		
		//import ::: Ctrl + Shift + o
		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("태백산맥1","조정래"));
		library.add(new Book("태백산맥2","조정래"));
		library.add(new Book("태백산맥3","조정래"));
		library.add(new Book("태백산맥4","조정래"));
		library.add(new Book("태백산맥5","조정래"));
		
		for(int i =0; i<library.size(); i++) {
			library.get(i).showInfo();
		}
	}

}
