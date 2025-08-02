package wrapperclasses;
import java.util.Scanner;
public class BoxingProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter an integer: ");
	        int a = sc.nextInt();

	        Integer boxed = Integer.valueOf(a);  // Manual Boxing

	        System.out.println("Primitive int: " + a);
	        System.out.println("Boxed Integer: " + boxed);

	}

}
