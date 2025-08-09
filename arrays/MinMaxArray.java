package arrays;

public class MinMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int[] arr = {7, 2, 15, 9, 1, 20};
	        int min = arr[0], max = arr[0];

	        for (int num : arr) {
	            if (num < min) min = num;
	            if (num > max) max = num;
	        }

	        System.out.println("Smallest: " + min);
	        System.out.println("Largest: " + max);
	}

}
