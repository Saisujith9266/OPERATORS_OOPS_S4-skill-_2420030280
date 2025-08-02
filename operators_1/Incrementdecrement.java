package operators_1;
import java.util.Scanner;
public class Incrementdecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("Enter a number: ");
          Scanner sc=new Scanner(System.in);
          int a=sc.nextInt();
          int b=++a;
          int c=--a;
          System.out.println("Increment "+b);
          System.out.println("Decrement "+c);

	}

}
