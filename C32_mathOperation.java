public class C32_mathOperation{

    // a. Multiply two integers
    void multiply(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication of two integers: " + result);
    }

    // b. Multiply three floats
    void multiply(float a, float b, float c) {
        float result = a * b * c;
        System.out.println("Multiplication of three floats: " + result);
    }

    // c. Multiply all elements of an integer array
    void multiply(int[] arr) {
        int result = 1;
        for (int num : arr) {
            result *= num;
        }
        System.out.println("Multiplication of array elements: " + result);
    }

    // d. Multiply one double and one integer
    void multiply(double a, int b) {
        double result = a * b;
        System.out.println("Multiplication of double and integer: " + result);
    }

    public static void main(String[] args) {
        Name.info();  // Print name and enrollment number

        C32_mathOperation mo = new C32_mathOperation();

        // Testing all versions of multiply
        mo.multiply(4, 5);                            // two integers
        mo.multiply(1.2f, 3.5f, 2.0f);                // three floats
        mo.multiply(new int[]{2, 3, 4});              // array elements
        mo.multiply(3.5, 4);                         // double and integer
    }
}
