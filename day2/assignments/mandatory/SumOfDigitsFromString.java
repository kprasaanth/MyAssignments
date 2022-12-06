package week1.day2.assignments.mandatory;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		int sum =0; 
		String text1 = text.replaceAll("[^0-9]", "");
		System.out.println("Numbers in String:"+text1);
		char[] charArray = text1.toCharArray();
		for (int i = 0; i < charArray.length; i++) {

			sum = sum+ Character.getNumericValue(charArray[i]);

		}
		System.out.println("Sum of numbers in String:" +sum);
	}

}
