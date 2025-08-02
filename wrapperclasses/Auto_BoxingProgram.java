package wrapperclasses;
import java.util.Scanner;
public class Auto_BoxingProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter an integer: ");
	        int a = sc.nextInt();

	        Integer autoBoxed = a;  // Auto-boxing

	        System.out.println("Primitive int: " + a);
	        System.out.println("Auto-boxed Integer: " + autoBoxed);	

	}

}
