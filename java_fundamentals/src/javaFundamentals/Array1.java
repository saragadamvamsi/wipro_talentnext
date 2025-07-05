package javaFundamentals;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {6,6,6,6,6};
		int sum = 0;
		double count = 0;
		for(int num : nums) {
			sum += num;
			count++;
		}
		double average = sum / count;
		System.out.println("The sum of Elements of the Array : "+sum);
		System.out.println("The average of the Array : "+average);
	}

}
