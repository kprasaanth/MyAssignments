package week3_day2_Assignments;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class FindtheNumberOfOccurrence {

	public static void main(String[] args) {
		int[] input= {2,3,5,6,3,2,1,4,2,1,6,-1};

		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

		for (int i = 0; i < input.length; i++) {
			if(!map.containsKey(input[i])) {
				map.put(input[i], 1);
			}else {
				Integer count = map.get(input[i]);
				map.put(input[i], count+1);
			}

		}

	/*	System.out.println(map);

		Set<Entry<Integer,Integer>> entry = map.entrySet();

		for (Entry<Integer, Integer> val : entry) {
			System.out.println("Key"+val.getKey()+"-->Value"+val.getValue());
		}
		Set<Integer> entrySet = map.keySet();

		Object[] array = entrySet.toArray();

		Collection<Integer> value = map.values();

		Object[] array2 = value.toArray();

		for (int i =array.length-1; i>=0; i--) {
			System.out.println(array[i]+"-->"+array2[i]);

		}
*/
	}
}


