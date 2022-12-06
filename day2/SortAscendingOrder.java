package week1.day2;

public class SortAscendingOrder {

	public static void main(String[] args) {
		int[] a= {2,6,3,6,34,3,4};
		int temp = 0;

		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}


		}
		for (int i = 0; i <= a.length-1; i++) {
			System.out.println(a[i]);
		}

	}

}
