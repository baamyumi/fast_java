package ch03;

public class CustomerTest {

	public static void main(String[] args) {

		//하위 클래스를 호출하면 상위클래스 생성자를 먼저 호출하고 하위생성자를 호출한다.
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("김유신");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		//블록주석 Crtl + Shift + /
		//하위클래스로 만들어졌지만, 상위클래스로 형변환이 되었기때문에 상위클래스의 멤버변수만 사용할 수 있다.
		Customer vc = new VIPCustomer();
		
	}

}
