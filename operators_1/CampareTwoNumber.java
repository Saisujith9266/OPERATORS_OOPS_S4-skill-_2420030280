package operators_1;
import java.util.Scanner;
public class CampareTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number");
		Scanner sc= new Scanner(System.in);
		int number1=sc.nextInt();
		int number2=sc.nextInt();
		if(number1>number2) {
			System.out.println(number1+ " is greater ");
		}
		else if(number1==number2) {
			System.out.println("Both are equal");
		}else {
			System.out.println(number2+" is greater");
		}

	}

}
