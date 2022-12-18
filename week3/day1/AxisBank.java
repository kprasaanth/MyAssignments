package week3.day1;

public class AxisBank extends AxisHQ implements RBI{

	public int withdrawalLimit() {
		return 1000000;
	}

	public String kyc() {
		return "Aadhar";
	}

	public void premiumCustomer() {
		System.out.println("Premium Customer");
		
	}

}
