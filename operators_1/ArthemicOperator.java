package operators_1;
import java.util.Scanner; 
public class ArthemicOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		int d=a-b;
		float e=a/b;
		int f=a*b;
		System.out.println("add of a and b"+c);
		System.out.println("sub of a and b"+d);
		System.out.println("div of a and b"+e);
		System.out.println("mul of a and b"+f);

	}

}
