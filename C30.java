import java.util.Scanner;

public class C30 {
    double radius;   // Data member to store radius
    double area;     // Data member to store area

    // Method to input radius
    void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        radius = scanner.nextDouble();
        scanner.close();
    }

    // Method to calculate area
    void calc() {
        area = Math.PI * radius * radius;
    }

    // Method to display area
    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area of the circle: " + area);
    }

    // Main method
    public static void main(String[] args) {
        Name.info();  // Print name and enrollment number

        C30 circle = new C30();
        circle.init();     // Input radius
        circle.calc();     // Calculate area
        circle.display();  // Display result
    }
}
