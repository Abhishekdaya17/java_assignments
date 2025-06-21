    //Accept person age ,gender, then check whether person is eligible for marriage or not
    import java.util.Scanner;
    public class C18_eligible {
        public static void main(String[] args) {
            Scanner scr = new Scanner(System.in);
            Name.info();              //method to print name and enrollment number.
            int age,gender;
            System.out.print("enter your age : ");
            age = scr.nextInt();
            System.out.print("your gender(1 for male & 0 for female) : ");
            gender = scr.nextInt();
            if (gender == 0){
                if (age > 18){
                    System.out.println("eligible for marriage.");
                }else{
                    System.out.println("not eligible for marriage.");
                }
            }else if (gender == 1){
                if (age >= 21){
                    System.out.println("eligible for marriage.");
                }else{
                    System.out.println("not eligible for marriage.");
                }
            }else{
                System.out.println("invalid inputs.");
            }
        }
    }