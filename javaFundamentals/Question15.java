package javaFundamentals;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num  = 8;
		int c = 0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				c++;
			}
		}
		if(c>0) {
			System.out.println(num+ " is not prime");
		}else {
			System.out.println(num+ " is prime");
		}
	}

}
