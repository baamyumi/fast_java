package ch06;

public class VIPCustomer extends Customer{
	
	double salesRatio;
	private String agentID;
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID,customerName);
		
		salesRatio = 0.1;
		bonusRatio = 0.05;
		customerGrade = "VIP";
	}

	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
	}


	public String getAgentID() {
		return agentID;
	}
}
