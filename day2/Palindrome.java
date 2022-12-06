package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String word = "Madam";
		String reverse = "";
		char[] charArray = word.toCharArray();
		for (int i = charArray.length-1; i >=0 ; i--) {
			reverse = reverse +charArray[i];
		}
		System.out.println(reverse);

		if(word.equalsIgnoreCase(reverse)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}
}


