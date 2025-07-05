package javaFundamentals;

import java.util.Scanner;

public class Question18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        if (!sc.hasNextInt()) {
            System.out.println("Please enter an integer number");
            return;
        }

        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
