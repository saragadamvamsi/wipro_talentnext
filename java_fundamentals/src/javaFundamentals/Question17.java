package java_fundamentals;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1234;
		int sum=0;
		while(n>0) {
			sum += n%10;
			n /= 10;
		}
		System.out.print("Sum of all digits of a number :  "+sum);
	}

}
