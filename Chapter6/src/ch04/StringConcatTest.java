package ch04;

public class StringConcatTest {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "World";
		
		/* 1.클래스를 이용한 객체 지향 방식 */
		StringConcatImpl strImpl = new StringConcatImpl();
		strImpl.makeString(s1, s2);
		
		/* 2.람다식으로 구현 */
		StringConcat concat = (s, v) -> System.out.println(s+ "," +v);
		concat.makeString(s1, s2);
	}

}
