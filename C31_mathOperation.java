import java.util.Scanner;

public class C31_mathOperation{
    double X, Y;  // operands
    double R;     // result

    // Method to input X and Y
    void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for X: ");
        X = scanner.nextDouble();

        System.out.print("Enter value for Y: ");
        Y = scanner.nextDouble();
        scanner.close();
    }

    // Method to add X and Y
    void add() {
        R = X + Y;
    }

    // Method to multiply X and Y
    void multiply() {
        R = X * Y;
    }

    // Method to calculate X^Y
    void power() {
        R = Math.pow(X, Y);
    }

    // Method to display result
    void display() {
        System.out.println("Result (R): " + R);
    }

    // Main method
    public static void main(String[] args) {
        Name.info();  // Print name and enrollment number

        C31_mathOperation op = new C31_mathOperation();

        op.init();        // Take input
        op.add();         // Perform addition
        System.out.print("Addition: ");
        op.display();     // Display result

        op.multiply();    // Perform multiplication
        System.out.print("Multiplication: ");
        op.display();     // Display result

        op.power();       // Perform power
        System.out.print("Power (X^Y): ");
        op.display();     // Display result
    }
}
