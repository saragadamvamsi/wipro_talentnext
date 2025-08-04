package javaFundamentals;

public class Array11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,4,1,6,4,1,4};
		boolean b = true;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] != 4 && nums[i] != 1) {
				b = false;
				break;
			}
		}
		System.out.println(b);
	}

}
