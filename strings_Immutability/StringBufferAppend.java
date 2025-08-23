package strings_Immutability;

public class StringBufferAppend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Before: " + sb);

        sb.append(" World");
        System.out.println("After: " + sb);

	}

}
