package ch04;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer��Lee = new Customer(10050,"�̼���");
		customer��Lee.bonusPoint = 10000;
		int price = customer��Lee.calcPrice(1000);
		System.out.println(customer��Lee.showCustomerInfo() + price);
		
		VIPCustomer customerKim = new VIPCustomer(10020,"������");
		customerKim.bonusPoint = 10000;
		price = customerKim.calcPrice(1000);
		System.out.println(customerKim.showCustomerInfo() + price);
		
		//����ּ� Crtl + Shift + /
		Customer vc = new VIPCustomer(12345,"noname");
		System.out.println(vc.calcPrice(1000));
		
	}

}
