package arrays;
import java.util.Scanner;
public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner sc = new Scanner(System.in);
	        int[] arr = {5, 10, 15, 20, 25};

	        System.out.print("Enter element to search: ");
	        int key = sc.nextInt();
	        boolean found = false;

	        for (int num : arr) {
	            if (num == key) {
	                found = true;
	                break;
	            }
	        }

	        if (found)
	            System.out.println(key + " is found.");
	        else
	            System.out.println(key + " is not found.");
	        sc.close();

	}

}
