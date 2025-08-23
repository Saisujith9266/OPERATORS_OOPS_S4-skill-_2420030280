package strings_Immutability;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println("s1 == s2: " + (s1 == s2));       
        System.out.println("s1.equals(s2): " + s1.equals(s2)); 

        System.out.println("s1 == s3: " + (s1 == s3));       
        System.out.println("s1.equals(s3): " + s1.equals(s3)); 
	}

}
