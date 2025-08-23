package strings_Immutability;

public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Java");

        sb.append(" Programming");
        sb.insert(5, "Language ");
        sb.replace(5, 13, "Code");
        sb.delete(5, 9);
        sb.deleteCharAt(0);
        sb.reverse();
        sb.reverse(); 

        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Char at 2: " + sb.charAt(2));
        sb.setCharAt(2, 'X');
        System.out.println("After setCharAt: " + sb);
        System.out.println("Substring from 5: " + sb.substring(5));
        System.out.println("Substring (5, 10): " + sb.substring(5, 10));
        System.out.println("toString(): " + sb.toString());

        sb.ensureCapacity(50);
        sb.setLength(10);
        System.out.println("After setLength: '" + sb + "'");
	}

}
