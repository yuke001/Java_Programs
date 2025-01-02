package Arrays;

import java.util.Arrays;

public class _05_BinarySearch_to_find_elements {
	
	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };

		int s = 40;

		System.out.println(Arrays.binarySearch(arr, s));
		// only work for sorted arrays
	}

}
