package week3_day2_Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String name = "PayPal India";
		
		char[] charArray = name.toCharArray();
		Set<Character> charSet  = new LinkedHashSet<Character>();
		
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] != ' ')
			charSet.add(charArray[i]);
		}
		//System.out.println(charSet);
		Object[] array = charSet.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		
	}

}
