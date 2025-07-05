package javaFundamentals;

public class Array10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {3,7,9,15,2,4,6,8};
		int arr[] = new int[nums.length];
		int index = 0;
		int end = nums.length-1;
		for(int i : nums) {
			if(i%2==0) {
				arr[index++] = i;
			}else {
				arr[end] = i;
				end = end-1;
			}
		}
		System.out.print("[");
		for(int num : arr) {
			System.out.print(num+" ");
		}
		System.out.print("]");
	}

}
