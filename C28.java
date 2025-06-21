import java.util.Scanner;

public class C28 {
    public static void main(String[] args) {
        Name.info(); // Print name and enrollment number

        Scanner scanner = new Scanner(System.in);

        int[][] A = new int[3][3];  // First matrix
        int[][] B = new int[3][3];  // Second matrix
        int[][] result = new int[3][3];  // Resultant matrix

        // Input for first matrix
        System.out.println("Enter elements of first 3x3 matrix (A):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        // Input for second matrix
        System.out.println("\nEnter elements of second 3x3 matrix (B):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = scanner.nextInt();
            }
        }

        // Matrix multiplication logic
        for (int i = 0; i < 3; i++) {         // Rows of A
            for (int j = 0; j < 3; j++) {     // Columns of B
                result[i][j] = 0;
                for (int k = 0; k < 3; k++) { // Columns of A / Rows of B
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Display Resultant Matrix
        System.out.println("\nResultant Matrix (A × B):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
