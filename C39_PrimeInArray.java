// Program to find prime numbers in an array

public class C39_PrimeInArray {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Name.info();    //to print name and roll number
        int[] arr = {10, 7, 4, 11, 13, 17, 20, 23, 29};

        System.out.print("Prime numbers in the array: ");
        for (int num : arr) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }
}
