import java.util.Scanner;

public class C20_prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Name.info();              //method to print name and enrollment number.
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        boolean isPrime = true;

        // 0 and 1 are not prime numbers
        if (num <= 1) {
            isPrime = false;
        } else {
            // Check from 2 to sqrt(num)
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is Not a Prime Number.");
        }

        scanner.close();
    }
}
