package javaFundamentals;
import java.util.*;
public class Question4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number < 0) {
			System.out.println(number+" is Negitive");
		}else if(number == 0) {
			System.out.println(number+" is Zero");
		}else {
			System.out.println(number+" is Positive");
		}
	}

}
