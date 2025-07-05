package javaFundamentals;
public class Array7 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 4, 2, 5, 3, 1};
        int n = arr.length;
        
        int[] temp = new int[n];
        int index = 0;
        
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[index++] = arr[i];
            }
        }
        System.out.print("[");
        for (int i = 0; i < index; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.print("]");
    }
}
