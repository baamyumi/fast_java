package ch15;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();
		
		Buy buyer = customer;//업캐스팅
		buyer.buy();
		buyer.order();
		
		Sell seller = customer;//업캐스팅
		seller.sell();
		seller.order();
	}

}
