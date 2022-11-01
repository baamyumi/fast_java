package ch09;

public class AutoCloseTest {

	public static void main(String[] args) {

		AutoCloseableObj obj = new AutoCloseableObj();
		
		try(obj){
			throw new Exception(); //exception 강제로 생성
		}catch(Exception e) {
			System.out.println("exception");
		}
		
		System.out.println("end");
	}

}
