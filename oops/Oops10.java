package oops;

import java.util.Scanner;

public class Oops10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str="";
		for(int i=0;i<s.length();i++) {
			str+=s.substring(0, 2);
		}
		System.out.println(str);
	}
}