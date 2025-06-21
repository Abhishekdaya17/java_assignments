// 74. Write a Java program to find numbers less than 7 in a TreeSet.

import java.util.TreeSet;

public class C81_LessThanSeven {
    public static void main(String[] args) {
        Name.info();

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(8);
        numbers.add(1);
        numbers.add(10);

        System.out.println("Numbers less than 7:");
        for (Integer num : numbers.headSet(7)) {
            System.out.println(num);
        }
    }
}
