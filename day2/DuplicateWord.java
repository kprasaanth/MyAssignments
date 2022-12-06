package week1.day2;

public class DuplicateWord {

	public static void main(String[] args) {
		String word = "amazon development";
		
		char[] charArray = word.toCharArray();
		for (int i = 0; i < charArray.length-1; i++) {
			for (int j = i+1; j < charArray.length-1; j++) {
				if(charArray[i] == charArray[j]) {
					System.out.println(charArray[i]);
					
				}
				
			}
			
		}

	}

}
