package day1.challenge;

import java.util.Scanner;

public class JavaChallenge1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter String:");
		String s = sc.nextLine();
		String[] split = s.split(" ");

		System.out.println(split[split.length-1].length());
	}



}

