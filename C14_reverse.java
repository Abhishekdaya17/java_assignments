//program to reverse integer 
import java.util.Scanner;
public class C14_reverse
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        Name.info();              //method to print name and enrollment number.
		int n,t,rv=0;
		System.out.print("enter number to reverse: ");
		n = sc.nextInt();
		while (n!=0){
			t = n%10;
			rv = (rv*10)+t;
			n = n/10;
		}
		System.out.print("reverse value : " +rv);
	}
}