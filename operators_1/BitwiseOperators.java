package operators_1;

import java.util.*;

public class BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter 2 numbers");
	      Scanner sc=new Scanner(System.in);
	      int a=sc.nextInt();
	      int b=sc.nextInt();
	      System.out.println("And operator "+(a&b));
	      System.out.println("Or Operator "+(a|b));
	      System.out.println("Xor Operator "+(a^b));
	      System.out.println("Complement operator a "+(~a)+" b: "+(~b));

	}

}
