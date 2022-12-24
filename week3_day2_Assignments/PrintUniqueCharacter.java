package week3_day2_Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String name = "babu";
		
		char[] charArray = name.toCharArray();
		
		Set<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			if(!set.contains(charArray[i])) {
				set.add(charArray[i]);
			}else {
				set.remove(charArray[i]);
			}
	}
		System.out.println(set);
		
}
}