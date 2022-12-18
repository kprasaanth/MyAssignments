package week3.day1;

public class iPad {
	public void watchMovie(){
		System.out.println("Overloading");
	}
	public void watchMovie(String orientation){
		
		System.out.println(orientation);
	}
	public void watchMovie(String orientation, int timeout){
		System.out.println(orientation+" "+timeout);
	}
}
