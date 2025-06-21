// 69. Write a Java program to count the number of elements in a TreeSet.

import java.util.TreeSet;

public class C76_CountTreeSet {
    public static void main(String[] args) {
        Name.info();  // method to print name and enrollment number

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Total number of elements: " + numbers.size());
    }
}
