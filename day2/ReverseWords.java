package week1.day2;

public class ReverseWords {

	public static void main(String[] args) {
		String word = "Amazon Development Center, Chennai";
		String[] newword = word.split(" ");
        for (int i = newword.length-1; i >=0 ; i--) {
			System.out.print(newword[i].toLowerCase()+ " ");
		}
	}

}
