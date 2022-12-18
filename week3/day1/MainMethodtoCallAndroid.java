package week3.day1;

public class MainMethodtoCallAndroid {

	public static void main(String[] args) {
		Samsung sam = new Samsung();
		System.out.println(sam.playVideo());
		
		
		OnePlus one = new OnePlus();
		System.out.println(one.playVideo());
	}

}
