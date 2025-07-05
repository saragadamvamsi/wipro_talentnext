package javaFundamentals;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {9,3,6,7,23,57,82,91,2,8,1};
		int target = 910;
		boolean b = false;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == target) {
				System.out.println("The index value of the " +target+ " : "+i);
				b = true;
				break;
			}
		}
		if(!b) {
			System.out.println("-1");
		}
	}

}
