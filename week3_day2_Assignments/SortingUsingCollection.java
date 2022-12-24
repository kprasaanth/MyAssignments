package week3_day2_Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] name = {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		Set<String> set = new TreeSet<String>();
		for (int i = 0; i < name.length; i++) {
			set.add(name[i]);
		}
		List<String> list = new ArrayList<String>(set);
		Collections.reverse(list);
		System.out.println(list);
	}

}
