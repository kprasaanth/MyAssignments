package week1.day2;

public class PrintOnlyNumbers {

	public static void main(String[] args) {
		String details = "Amazon has 11400 employees in chennai";

		details.toLowerCase();
		String number= details.replaceAll("[^0-9]", "");
		System.out.println(number);
	}

}
