package ch03;

public class CustomerTest {

	public static void main(String[] args) {

		//���� Ŭ������ ȣ���ϸ� ����Ŭ���� �����ڸ� ���� ȣ���ϰ� ���������ڸ� ȣ���Ѵ�.
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("������");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		//����ּ� Crtl + Shift + /
		//����Ŭ������ �����������, ����Ŭ������ ����ȯ�� �Ǿ��⶧���� ����Ŭ������ ��������� ����� �� �ִ�.
		Customer vc = new VIPCustomer();
		
	}

}
