package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");
		Student std3 = std1;//주소값만 복사
		
		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2));
		
		//재정의한 hashCode() 메서드 > 학생번호
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		//실세 hashcode 값
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));
		
		std1.setStudentName("Kim");
		Student copyStudent = (Student)std1.clone();
		System.out.println(copyStudent);
	}

}
