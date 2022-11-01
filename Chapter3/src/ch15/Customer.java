package ch15;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("cuctomer sell");
	}

	@Override
	public void buy() {
		System.out.println("cuctomer buy");
	}

	//Buy, Sell 중복된 default 메서드 재정의
	@Override
	public void order() {
		System.out.println("customer order");
	}

	public void hello() {
		System.out.println("hello");
	}
}
