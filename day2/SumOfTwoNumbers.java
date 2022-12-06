package week1.day2;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,5,3};
		int target = 5;
	    
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length-1; j++) {
				if(a[i]+a[j] == target) {
					System.out.println("values are"+ a[i]+"and"+a[j]);
				}
				
			}
			
		}

	}

}
