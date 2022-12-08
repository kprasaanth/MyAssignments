package day3_.challenge;


public class Palindrome {

	public static void main(String[] args) {
		
		String s = "A man, a plan, a canal: Panama"; 
		String rev = "";
		String s1 = s.toLowerCase();
		String s3 = s1.replaceAll("//s", "");
		String s2 = s3.replaceAll("[^0-9a-z]", "");
		char[] charArray = s2.toCharArray();
		for (int i = charArray.length-1; i >=0 ; i--) {
			rev +=charArray[i];
		}

		if(rev.equals(s2)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}



	}
}
