package javaFundamentals;
import java.util.*;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println(num+" is Even");
		}else {
			System.out.println(num+" is Odd");
		}
	}

}
