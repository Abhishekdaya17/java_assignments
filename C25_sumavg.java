import java.util.Scanner;

public class C25_sumavg {
    public static void main(String[] args) {
        Name.info();              //method to print name and enrollment number.
        int a[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int num, i, len=10;
        float avg = 0, sum = 0;
        for (i = 0;i < 10;i++){
            System.out.printf("Enter element %d : ",i+1);
            num = sc.nextInt();
            a[i] = num;
        }
        len = a.length;
        for (i = 0;i < 10 ; i++){
            sum += a[i];
        }
        System.out.println("sum = "+sum);
        System.out.println("average = "+sum/len);



    }
}
