package week3_day2_Assignments;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindMostDuplicateNumber {

	public static void main(String[] args) {
		String input ="abbaba";
		
		char[] charArray = input.toCharArray();
		
		Map<Character, Integer> map = new LinkedHashMap<Character,Integer>();
		
		for (int i = 0; i < charArray.length; i++) {
			if(!map.containsKey(charArray[i])) {
				map.put(charArray[i], 1);
			}else {
				System.out.println(charArray[i]);
				break;
			}
				/*Integer count = map.get(charArray[i]);
				map.put(charArray[i], count+1);
			}
		}
		
		int a = Collections.max(map.values());
		
		for (Entry<Character,Integer> entry : map.entrySet()) {
			if(entry.getValue() == a) {
				System.out.println("Max Occurance of Character is "+entry.getKey());
				
			}
		}*/
				
	}

}
}