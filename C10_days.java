//days to year, months and days
import java.util.Scanner;
public class C10_days {
    public static void main(String[] args) {
        Name.info();              //method to print name and enrollment number.
        Scanner scr = new Scanner(System.in);
        int days,years,days_left,month;
        System.out.print("enter number of days: ");
        days = scr.nextInt();                 
        years = days/365;                    
        days_left = days%365;                    
        month = days_left/30;
        days = days_left%30;                    
        System.out.printf(" %d years %d months and %d days",years,month,days);
    }
}
