package javaFundamentals;

public class Array12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[] = {1,2,3};
		int nums2[] = {4,5,6};
		int nums[] = new int[2];
		nums[0] = nums1[1];
		nums[1] = nums2[1];
		System.out.print("[");
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.print("]");
	}

}
