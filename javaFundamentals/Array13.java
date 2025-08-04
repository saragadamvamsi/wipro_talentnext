package javaFundamentals;
import java.util.*;
public class Array13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nums[][] = new int[2][2];
		int arr[] = new int[4];
		for(int i=0;i<2*2;i++) {
			arr[i] = sc.nextInt();
		}
		int index = 3;
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				nums[i][j] = arr[index--];
			}
		}
		for(int i=0;i<2;i++) {
			System.out.print("[");
			for(int j=0;j<2;j++) {
				System.out.print(nums[i][j]+ " ");
			}
			System.out.print("]");
			System.out.println();
		}
	}

}
