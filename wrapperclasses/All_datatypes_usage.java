package wrapperclasses;
import java.util.Scanner;
public class All_datatypes_usage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a byte value: ");
        byte b = sc.nextByte();

        System.out.print("Enter a short value: ");
        short s = sc.nextShort();

        System.out.print("Enter an int value: ");
        int i = sc.nextInt();

        System.out.print("Enter a long value: ");
        long l = sc.nextLong();

        System.out.print("Enter a float value: ");
        float f = sc.nextFloat();

        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();

        System.out.print("Enter a single character: ");
        char c = sc.next().charAt(0);

        System.out.print("Enter true/false: ");
        boolean bool = sc.nextBoolean();

        sc.nextLine(); // consume newline
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("\n--- Displaying Values ---");
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Char: " + c);
        System.out.println("Boolean: " + bool);
        System.out.println("String: " + str);
	}

}
