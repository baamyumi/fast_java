package ch04;

public class StringConcatTest {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "World";
		
		/* 1.Ŭ������ �̿��� ��ü ���� ��� */
		StringConcatImpl strImpl = new StringConcatImpl();
		strImpl.makeString(s1, s2);
		
		/* 2.���ٽ����� ���� */
		StringConcat concat = (s, v) -> System.out.println(s+ "," +v);
		concat.makeString(s1, s2);
	}

}
