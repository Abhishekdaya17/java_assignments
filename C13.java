import java.util.Scanner;

public class C13 {
    public static void main(String[] args) {
        Name.info();  // Print name and enrollment number

        Scanner scanner = new Scanner(System.in);

        // For (a), (b), (c) assume x and y are integers
        // For (d), assume x and y are booleans

        // a. y = x^2 + 3x - 7
        System.out.print("Enter integer value for x (for a): ");
        int x_a = scanner.nextInt();
        int y_a = x_a * x_a + 3 * x_a - 7;
        System.out.println("a) Value of y = " + y_a);

        // b. y = x++ + ++x
        System.out.print("\nEnter integer value for x (for b): ");
        int x_b = scanner.nextInt();
        int y_b = x_b++ + ++x_b;
        System.out.println("b) After evaluation:");
        System.out.println("   x = " + x_b);
        System.out.println("   y = " + y_b);

        // c. z = x++ - --y - --x + x++
        System.out.print("\nEnter integer value for x (for c): ");
        int x_c = scanner.nextInt();
        System.out.print("Enter integer value for y (for c): ");
        int y_c = scanner.nextInt();
        int z_c = x_c++ - --y_c - --x_c + x_c++;
        System.out.println("c) After evaluation:");
        System.out.println("   x = " + x_c);
        System.out.println("   y = " + y_c);
        System.out.println("   z = " + z_c);

        // d. z = x && y || !(x || y)
        // Here x and y are boolean variables
        System.out.print("\nEnter boolean value for x (true/false) (for d): ");
        boolean x_d = scanner.nextBoolean();
        System.out.print("Enter boolean value for y (true/false) (for d): ");
        boolean y_d = scanner.nextBoolean();
        boolean z_d = (x_d && y_d) || !(x_d || y_d);
        System.out.println("d) Value of z = " + z_d);

        scanner.close();
    }
}
