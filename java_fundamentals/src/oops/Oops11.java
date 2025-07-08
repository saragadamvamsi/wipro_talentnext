package oops;

import java.util.Scanner;

public class Oops11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s.length()%2==1) {
			System.out.println("null");
		}
		else {
			System.out.println(s.substring(0,s.length()/2));
		}
	}
}