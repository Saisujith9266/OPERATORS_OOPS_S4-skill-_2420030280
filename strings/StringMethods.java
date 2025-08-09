package strings;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String text = "  Java Programming  ";

	        System.out.println("Original: '" + text + "'");
	        System.out.println("Length: " + text.length());
	        System.out.println("Uppercase: " + text.toUpperCase());
	        System.out.println("Lowercase: " + text.toLowerCase());
	        System.out.println("Trimmed: '" + text.trim() + "'");
	        System.out.println("Substring(2,6): " + text.substring(2, 6));
	        System.out.println("Replace 'a' with 'x': " + text.replace('a', 'x'));
	        System.out.println("Starts with 'Ja': " + text.trim().startsWith("Ja"));
	        System.out.println("Ends with 'ing': " + text.trim().endsWith("ing"));
	        System.out.println("Character at index 5: " + text.charAt(5));
	        System.out.println("Index of 'Pro': " + text.indexOf("Pro"));
	}

}
