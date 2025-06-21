import java.util.Scanner;
public class C17_leap {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        Name.info();              //method to print name and enrollment number.
        int year;
        System.out.print("enter year to check leap or not : ");
        year = scr.nextInt();
        if ((year % 400 == 0) || (year%4 == 0 && year%100 !=0)){
                System.out.println("leap year");
        }else{
            System.out.println("not a leap year");
        }
    }
}
