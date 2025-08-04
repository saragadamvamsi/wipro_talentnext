package oops;
import java.util.*;
public class Oops21 {
    public static void main(String[] args) {
        String names[] = new String[5];
        Optional<String> optionalName = Optional.ofNullable(names[0]);
        int length = optionalName.map(String::length).orElse(0);
        System.out.println("Length: " + length);
    }
}
