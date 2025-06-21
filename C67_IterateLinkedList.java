// 60. Write a Java program to iterate through all elements in a linked list.

import java.util.LinkedList;

public class C67_IterateLinkedList {
    public static void main(String[] args) {
        Name.info();  // method to print name and enrollment number

        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("Iterating through LinkedList:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
