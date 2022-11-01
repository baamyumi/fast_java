package ch04;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerㅣLee = new Customer(10050,"이순신");
		customerㅣLee.bonusPoint = 10000;
		int price = customerㅣLee.calcPrice(1000);
		System.out.println(customerㅣLee.showCustomerInfo() + price);
		
		VIPCustomer customerKim = new VIPCustomer(10020,"김유신");
		customerKim.bonusPoint = 10000;
		price = customerKim.calcPrice(1000);
		System.out.println(customerKim.showCustomerInfo() + price);
		
		//블록주석 Crtl + Shift + /
		Customer vc = new VIPCustomer(12345,"noname");
		System.out.println(vc.calcPrice(1000));
		
	}

}
