package javaFundamentals;

public class Array9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,99,10};
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == 10) {
				nums[i] = 0;
				count++;
			}
		}
		int arr[] = new int[nums.length];
		int index  =0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] != 0) {
				arr[index++] = nums[i];
			}
		}
		for(int i=nums.length-count;i<nums.length;i++) {
			arr[i] = 0;
		}
		System.out.print("[");
		for(int i=0;i<nums.length;i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.print("]");
	}

}
