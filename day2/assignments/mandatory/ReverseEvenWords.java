package week1.day2.assignments.mandatory;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester"; 
		String[] split1 = test.split(" ");


		for (int i = 0; i < split1.length; i++) {
			if(i%2 ==0) {
				char[] charArray = split1[i].toCharArray(); 

				for (int j = charArray.length-1; j >=0 ; j--) {
					System.out.print(charArray[j]);

				}

			}else {
				System.out.print(" "+split1[i]+ " ");
			}

		}
	}

}
