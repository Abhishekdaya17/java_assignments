// 62. Write a Java program to iterate a linked list in reverse order.

import java.util.LinkedList;
import java.util.Iterator;

public class C69_ReverseIterateLinkedList {
    public static void main(String[] args) {
        Name.info();  // method to print name and enrollment number

        LinkedList<String> cities = new LinkedList<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Kolkata");

        System.out.println("Iterating in reverse order:");

        Iterator<String> itr = cities.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
