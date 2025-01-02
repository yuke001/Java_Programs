package _27_09_24;

import java.util.Arrays;

public class _06_Add_two_Unsorted_Array_Print_Ascending_Order {

	public static void main(String[] args) {

		int[] a1 = { 4, 5, 3, 1, 2 };
		int[] a2 = { 6, 8, 9, 7, 10 };

		int[] add = new int[a1.length + a2.length];
		int j1 = 0;

		for (int i = 0; i < a1.length; i++) {
			add[j1++] = a1[i];
		}
		for (int j = 0; j < a2.length; j++) {
			add[j1++] = a2[j];
		}

		Arrays.sort(add);

		for (int a : add) {
			System.out.print(a + " ");
		}

	}

}
