package arrays;
import java.util.LinkedHashSet;
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int[] arr = {10, 20, 20, 30, 40, 40, 50};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        System.out.println("Unique elements:");
        for (int num : set) {
            System.out.print(num + " ");
        }
		

	}

}
