package week1.day2.assignments.mandatory;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";	
		String[] split1 = text.split(" ");
		for (int i = 0; i < split1.length; i++) {
			for (int j = i+1; j < split1.length; j++) {
				if(split1[i].equals(split1[j])) {

					split1[i]= split1[i].replaceAll(split1[i], ""); 

				}

			}

		}
		for (int k = 0; k < split1.length; k++) {
			System.out.print(split1[k]+ " ");

		}

	}

}
