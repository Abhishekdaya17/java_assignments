public class C23 {
    public static void main(String[] args) {
        Name.info();  // Print name and enrollment number

        int n = 10; // Number of terms
        int[] series = new int[n];

        // Initialize first three terms
        series[0] = 1;
        series[1] = 2;
        series[2] = 3;

        int sum = series[0] + series[1] + series[2];

        // Calculate next terms using series[n] = series[n-1] + series[n-2] + series[n-3]
        for (int i = 3; i < n; i++) {
            series[i] = series[i - 1] + series[i - 2] + series[i - 3];
            sum += series[i];
        }

        // Print the series
        System.out.print("Series terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(series[i] + " ");
        }

        System.out.println("\nSum of first " + n + " terms = " + sum);
    }
}
