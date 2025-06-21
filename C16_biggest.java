// program to find biggest number among given three numbers.
import java.util.Scanner;
public class C16_biggest {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Name.info();              //method to print name and enrollment number.
        int num1,num2,num3,d;
        System.out.print("Enter number 1 : ");
        num1 = scr.nextInt();
        System.out.print("Enter number 2 : ");
        num2 = scr.nextInt();
        System.out.print("Enter number 3 : ");
        num3 = scr.nextInt();
        d = (num1>num2 && num1 > num3)?num1:(num2>num3)?num2:num3;
        System.out.println("greatest number is " +d);
        
    }
    
}
