//program to calculate simple interest
import java.util.Scanner;
public class C9_smp_Interest {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Name.info();              //method to print name and enrollment number.
        float P ,R,T ,SI;
        System.out.print("enter principle amount : ");
        P = scr.nextFloat();
        System.out.print("enter rate of interest : ");
        R = scr.nextFloat();
        System.out.print("enter time in year : ");
        T = scr.nextFloat();
        
        SI = (P*R*T)/100;
        System.out.println("simple interest is "+SI);
        
    }
}
