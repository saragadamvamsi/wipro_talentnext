package oops;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Oops19 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");

        StringJoiner joiner = new StringJoiner(", ", "{", "}");
        for (String name : names) {
            joiner.add(name);
        }
        System.out.println(joiner.toString());
    }
}
