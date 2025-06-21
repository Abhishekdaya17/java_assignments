// 63. Write a Java program to insert a specified element at a given position in a linked list.

import java.util.LinkedList;

public class C70_InsertAtPosition {
    public static void main(String[] args) {
        Name.info();  // method to print name and enrollment number

        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");

        System.out.println("Original LinkedList: " + animals);

        // Insert "Lion" at index 1
        animals.add(1, "Lion");

        System.out.println("After inserting at position 1: " + animals);
    }
}
