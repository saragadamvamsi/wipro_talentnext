package javaFundamentals;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {4,2,6,8,3,1,9};
		int minimum = nums[0];
		int maximum = nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i] > maximum) {
				maximum = nums[i];
			}else if(nums[i] < minimum) {
				minimum = nums[i];
			}
		}
		System.out.println("The minimum Element in the Array : "+minimum);
		System.out.println("The maximum Element in the Array : "+maximum);
	}

}
