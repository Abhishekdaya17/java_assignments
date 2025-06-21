//program to take input for marks fo five subject  and calculate percentage 
import java.util.Scanner;
public class C8_percentage {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Name.info();              //method to print name and enrollment number.
        double sub1,sub2,sub3,sub4,sub5,result;
        System.out.print("enter marks of subject 1 : ");
        sub1 = scr.nextFloat();

        System.out.print("enter marks of subject 2 : ");
        sub2 = scr.nextFloat();

        System.out.print("enter marks of subject 3 : ");
        sub3 = scr.nextFloat();

        System.out.print("enter marks of subject 4 : ");
        sub4 = scr.nextFloat();

        System.out.print("enter marks of subject 5 : ");
        sub5 = scr.nextFloat();

        result = (sub1+sub2+sub3+sub4+sub5)/5;
        System.out.println("you got " +result+ " %");
    }
}
