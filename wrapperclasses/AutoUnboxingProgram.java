package wrapperclasses;
import java.util.Scanner;
public class AutoUnboxingProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter an integer (for Wrapper): ");
	        Integer autoBoxed = sc.nextInt();

	        int autoUnboxed = autoBoxed;  // Auto-unboxing

	        System.out.println("Wrapper Integer: " + autoBoxed);
	        System.out.println("Auto-unboxed int: " + autoUnboxed);
		

	}

}
