import java.util.Scanner;

public class C12_swap {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        Name n = new Name();
        Name.info();              //method to print name and enrollment number.
        int num1,num2;
        System.out.print("Enter num1 : ");
        num1 = scr.nextInt();
        System.out.print("Enter num2 : ");
        num2 = scr.nextInt();

        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.printf("num1 = %d \n num2 = %d",num1,num2);
    }
}
