package ch21;

import java.util.ArrayList;

public class ArrayListTest extends ObjectCopyTest {

	public static void main(String[] args) {
		
		//import ::: Ctrl + Shift + o
		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("�¹���1","������"));
		library.add(new Book("�¹���2","������"));
		library.add(new Book("�¹���3","������"));
		library.add(new Book("�¹���4","������"));
		library.add(new Book("�¹���5","������"));
		
		for(int i =0; i<library.size(); i++) {
			library.get(i).showInfo();
		}
	}

}