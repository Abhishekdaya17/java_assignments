import java.util.Scanner;

public class C27 {
    public static void main(String[] args) {
        Name.info();  // Print name and enrollment number

        Scanner scanner = new Scanner(System.in);

        int rows = 5;
        int cols = 4; // We'll use 4 columns per row, but last row will have only 1 element (5*4=20 > 17)
        int[][] arr = new int[rows][cols];
        int count = 0, totalElements = 17, sum = 0;

        System.out.println("Enter 17 elements:");

        for (int i = 0; i < rows && count < totalElements; i++) {
            for (int j = 0; j < cols && count < totalElements; j++) {
                System.out.print("Enter element " + (count + 1) + ": ");
                arr[i][j] = scanner.nextInt();
                sum += arr[i][j];
                count++;
            }
        }

        // Display array in matrix format
        System.out.println("\nArray elements in 5-row layout:");
        count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (count < totalElements) {
                    System.out.print(arr[i][j] + "\t");
                    count++;
                }
            }
            System.out.println();
        }

        // Output total sum
        System.out.println("\nSum of all 17 elements: " + sum);

        scanner.close();
    }
}
