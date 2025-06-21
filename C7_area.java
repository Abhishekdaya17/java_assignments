//program to find area and circumference of circle by taking radius as input from user

import java.util.Scanner;
public  class C7_area {
    public static void main(String[] args){
        Name.info();              //method to print name and enrollment number.
        double radius,area,circumference;
        Scanner scr = new Scanner(System.in);
        System.out.print("enter radius of circle : ");
        radius = scr.nextFloat();
        circumference = 2*3.14*radius;
        area = 3.14*radius*radius;
        System.out.println("area of circle : " +area);
        System.out.println("circumference of circle : " +circumference);
        
    }
} 
