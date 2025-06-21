import java.util.*;

public class C26 {
    public static void main(String[] args) {
        Name.info();  // Print name and enrollment number

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];

        // Input 10 elements
        System.out.println("Enter 10 elements:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Sort in descending order using simple bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Output the sorted array
        System.out.println("Array in Descending Order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
