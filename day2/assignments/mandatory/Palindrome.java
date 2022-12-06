package week1.day2.assignments.mandatory;

public class Palindrome {

	public static void main(String[] args) {
		String word = "Madam";
		String rev = "";
		char[] charArray = word.toCharArray();
		for (int i = charArray.length-1; i >=0; i--) {
        rev = rev+charArray[i] ;

		}
		if(word.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}
