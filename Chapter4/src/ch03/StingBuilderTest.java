package ch03;

public class StingBuilderTest {

	public static void main(String[] args) {

		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(java));
		buffer.append(android);
		System.out.println(System.identityHashCode(java));	//메모리 주소가 같음
		
		String test = buffer.toString();
		System.out.println(test);
		
	}

}
