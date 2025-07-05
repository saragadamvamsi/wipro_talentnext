package java_fundamentals;
import java.util.*;
import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("i/p: ");
        char ch = sc.next().charAt(0);

        if (Character.isLowerCase(ch)) {
            char upper = Character.toUpperCase(ch);
            System.out.println("o/p: " + ch + "->" + upper);
        } else if (Character.isUpperCase(ch)) {
            char lower = Character.toLowerCase(ch);
            System.out.println("o/p: " + ch + "->" + lower);
        } else {
            System.out.println("Invalid input. Please enter an alphabet character.");
        }
    }
}
