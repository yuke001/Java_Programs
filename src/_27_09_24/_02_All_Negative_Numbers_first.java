package _27_09_24;

import java.util.Arrays;

// output : -12,-13,-5,-7,-3,-6,11,6,5

public class _02_All_Negative_Numbers_first {

	public static void main(String[] args) {

		int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };

		int[] arr1 = new int[arr.length];

		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				arr1[j++] = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				arr1[j++] = arr[i];
			}
		}
		for (int no : arr1) {
			System.out.print(no + " ");
		}

	}

}
