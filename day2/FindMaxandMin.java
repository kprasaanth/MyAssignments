package week1.day2;

import java.util.Arrays;

public class FindMaxandMin {

	public static void main(String[] args) {
		int[] num= {2,5,7,7,5,9,2,3};

		Arrays.sort(num);

		System.out.println("Min"+num[0]);
		System.out.println("Max"+num[num.length-1]);


	}

}
