package week1.day2;

public class CountE {

	public static void main(String[] args) {
		String a="hexaware";
		char[] b= a.toCharArray();
		int count=0;

		for (int i = 0; i < b.length; i++) {

			if(b[i]== 'e') {
				count++;
				
			}
		}
		System.out.println(count);
	}

}
