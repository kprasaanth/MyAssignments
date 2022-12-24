package week3_day2_Assignments;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int[] num = {1,2,2,3,5,4,6,8,8,10};

		Set<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < num.length; i++) {
			set.add(num[i]);
		}
		System.out.println(set);
		Set<Integer> lhs = new LinkedHashSet<Integer>();
		for(int i=1;i<=num.length;i++) {
			if(!set.contains(i)) {
				lhs.add(i);
			}
		}
		System.out.println(lhs);

	}

}
