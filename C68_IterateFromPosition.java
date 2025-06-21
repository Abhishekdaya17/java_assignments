// 61. Write a Java program to iterate through all elements starting from a specified position in a linked list.

import java.util.LinkedList;

public class C68_IterateFromPosition {
    public static void main(String[] args) {
        Name.info();  // method to print name and enrollment number

        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        int startIndex = 2; // starting from index 2

        System.out.println("Iterating from index " + startIndex + ":");

        for (int i = startIndex; i < fruits.size(); i++) {
            System.out.println("Element at index " + i + ": " + fruits.get(i));
        }
    }
}
