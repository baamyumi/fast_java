package ch01;

class Book{
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	//Object 클래스의 toString을 재정의하여 사용
	@Override
	public String toString() {
		return title +","+ author;
	}
	
}

public class BookTest {

	public static void main(String[] args) {

		Book book = new Book("데미안", "헤르만헤세");
		
		System.out.println(book);
		
		String str = new String("test");
		System.out.println(str.toString());
	}
}
