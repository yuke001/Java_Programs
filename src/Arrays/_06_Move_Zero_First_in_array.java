package Arrays;

import java.util.Arrays;

public class _06_Move_Zero_First_in_array {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 3, 2, 0, 3, 5, 0, 4 };

		Arrays.sort(arr);

		for (int a : arr) {
			System.out.print(a);
		}
	}

}
