package week3.day1;

public class MyBank {

	public static void main(String[] args) {
		AxisBank axis = new AxisBank();
		System.out.println(axis.withdrawalLimit());
		System.out.println(axis.kyc());
		axis.premiumCustomer();
		
		SBI sbi = new SBI();
		System.out.println(sbi.withdrawalLimit());
		System.out.println(sbi.kyc());
	}

}
