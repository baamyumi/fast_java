package ch02;

public class VIPCustomer extends Customer{
	
	double salesRatio;
	private String agentID;
	
	public VIPCustomer() {
		salesRatio = 0.1;
		bonusRatio = 0.05;
		customerGrade = "VIP";
	}

	public String getAgentID() {
		return agentID;
	}
}
