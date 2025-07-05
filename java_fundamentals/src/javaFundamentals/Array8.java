package javaFundamentals;

public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,6,4,7,9};
		int indexOf6 = -1;
		int indexOf7 = -1;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == 6) {
				indexOf6 = i;
			}else if(nums[i] == 7) {
				indexOf7 = i;
			}
		}
		int sum =0;
		if(indexOf7 > indexOf6) {
			for(int i=0;i<nums.length;i++) {
				if(i>=indexOf6 && i<=indexOf7) continue;
				sum += nums[i];
			}
		}else {
			for(int i=0;i<nums.length;i++) {
				sum += nums[i];
			}
		}
		
		System.out.println(sum);
	}

}
