// 66. Write a Java program to display the elements of a TreeSet in reverse order.

import java.util.TreeSet;
import java.util.Iterator;

public class C73_ReverseTreeSet {
    public static void main(String[] args) {
        Name.info();  // method to print name and enrollment number

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);

        Iterator<Integer> reverseItr = numbers.descendingIterator();
        System.out.println("TreeSet in reverse order:");
        while (reverseItr.hasNext()) {
            System.out.println(reverseItr.next());
        }
    }
}
