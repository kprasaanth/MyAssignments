package week3_day2_Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};

		Set<Integer> set = new TreeSet<Integer>();

		for (int i = 0; i < data.length; i++) {
			set.add(data[i]);
		}
		
		List<Integer> list = new ArrayList<Integer>(set);
		System.out.println(list);
		int a=list.size();
		System.out.println("Second largest number is :"+list.get(a-2));

		/*Collections.reverse(list);
		 System.out.println("Second largest number is :"+list.get(1)); */

	}

}
