package wrapperclasses;
import java.util.Scanner;
public class UnboxingProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter an integer (for Wrapper): ");
	        Integer boxed = new Integer(sc.nextInt());

	        int unboxed = boxed.intValue(); // Manual Unboxing

	        System.out.println("Wrapper Integer: " + boxed);
	        System.out.println("Unboxed int: " + unboxed);

	}

}
