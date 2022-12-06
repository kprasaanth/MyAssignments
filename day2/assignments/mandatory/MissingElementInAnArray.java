package week1.day2.assignments.mandatory;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			if((i+1) == arr[i]) {
				continue;
			}else {
				System.out.println(i+1);
				break;
			}
		}

	}

}
