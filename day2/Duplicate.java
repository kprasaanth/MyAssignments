package week1.day2;

public class Duplicate {

	public static void main(String[] args) {
		int[] num= {2,5,7,7,5,9,2,3};
		for (int i = 0; i < num.length-1; i++) {
			for (int j = i+1; j < num.length-1; j++) {
				if(num[i]==num[j]) {
					System.out.println("Duplicate values are:"+num[i]);
				}
				
			}
			
		}

	}

}
