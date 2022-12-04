package week1.day1;

public class Fibbinocci {
	public static void main(String[] args) {
		int firstNum = 0, secNum = 1, sum;
		System.out.println(firstNum);
		for (int i = 1; i <= 12; i++) {
			sum = firstNum + secNum;
			System.out.println(sum);
			secNum = firstNum;
			firstNum = sum;
			
		}
	}

}
