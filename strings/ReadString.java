package strings;

import java.util.Scanner;

public class ReadString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        System.out.println("You entered: " + input);
	        sc.close();
	}

}
