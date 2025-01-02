package _27_09_24;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_Intersection_Of_3_Array {

	static void interSection(int[] a1, int[] a2) {

		for (int i = 0; i < a1.length; i++) {

			for (int j = 0; j < a2.length; j++) {

				if (a1[i] == a2[j]) {

					System.out.print(a1[i] + " ");
				}
			}
		}

	}

	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 5, 6 };
		int[] a2 = { 1, 7, 4, 8, 3, 9 };
		int[] a3 = { 7, 3, 9, 2, 8, 5 };

		interSection(a1, a2);
		interSection(a2, a3);

		System.out.println();

		// using ArrayList

		ArrayList arr1 = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6));
		ArrayList arr2 = new ArrayList(Arrays.asList(1, 7, 4, 8, 3, 9));
		ArrayList arr3 = new ArrayList(Arrays.asList(7, 3, 9, 2, 8, 5));

		arr1.retainAll(arr2);

		System.out.println(arr1);

		arr2.retainAll(arr3);

		System.out.println(arr2);

	}

}
