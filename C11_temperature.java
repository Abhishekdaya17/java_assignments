//convert temperature from Fahrenheit to celsius
import java.util.Scanner;
public class C11_temperature {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Name.info();              //method to print name and enrollment number.
        float Fahrenheit;
        System.out.print("Enter temperature in Fahrenheit : ");
        Fahrenheit = scr.nextFloat();   
        System.out.println("temperature in celsius is : " + (5*(Fahrenheit-32)/9));
    }
}
