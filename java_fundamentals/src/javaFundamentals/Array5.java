package javaFundamentals;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 4, 2, 6, 8, 3, 1, 9 };

		int firstMin = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
		int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < firstMin) {
				secondMin = firstMin;
				firstMin = nums[i];
			} else if (nums[i] < secondMin && nums[i] != firstMin) {
				secondMin = nums[i];
			}

			if (nums[i] > firstMax) {
				secondMax = firstMax;
				firstMax = nums[i];
			} else if (nums[i] > secondMax && nums[i] != firstMax) {
				secondMax = nums[i];
			}
		}

		System.out.println("First Minimum: " + firstMin);
		System.out.println("Second Minimum: " + secondMin);
		System.out.println("First Maximum: " + firstMax);
		System.out.println("Second Maximum: " + secondMax);

	}

}
