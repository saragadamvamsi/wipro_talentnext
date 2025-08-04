package javaFundamentals;
import java.util.*;
public class Question4b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int num2 = sc.nextInt();
		int num1LastDigit = num1%10;
		int num2LastDigit = num2%10;
		if(num1LastDigit == num2LastDigit) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
