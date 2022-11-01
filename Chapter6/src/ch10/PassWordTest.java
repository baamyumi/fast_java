package ch10;

public class PassWordTest {

	private String password;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws PassWordException{
		
		if(password == null) {
			throw new PassWordException("비밀번호는 null일 수 없습니다.");
		}
		else if(password.length() < 5) {
			throw new PassWordException("비밀번호는 5자 이상이어야 합니다.");
		}
		else if(password.matches("[a-zA-Z]+")) {
			throw new PassWordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
		}
		this.password = password;
	}


	public static void main(String[] args) {
		/* 사용자 정의 예외처리 */
		PassWordTest test = new PassWordTest();
		
		//null 테스트
		String password = null;
		
		try {
			test.setPassword(password);
			System.out.println("오류없음1");
			
		} catch (PassWordException e) {

			System.out.println(e.getMessage());
		}
		
		
		//5자 이하 테스트
		password = "abc";
		
		try {
			test.setPassword(password);
			System.out.println("오류없음2");
			
		} catch (PassWordException e) {

			System.out.println(e.getMessage());
		}
		
		//특수문자 테스트
		password = "abcde";
		
		try {
			test.setPassword(password);
			System.out.println("오류없음3");
			
		} catch (PassWordException e) {

			System.out.println(e.getMessage());
		}
		
		//오류없음 테스트
		password = "abcde1#";
		
		try {
			test.setPassword(password);
			System.out.println("오류없음4");
			
		} catch (PassWordException e) {

			System.out.println(e.getMessage());
		}
	}

}
