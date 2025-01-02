package _27_09_24;

import java.util.Arrays;

public class _05_Nth_Max_Min_Value_in_Array {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 3, 6, 5, 6 };
		int len = arr.length;
		int n = 3;

		Arrays.sort(arr);

		System.out.println("Max : " + arr[len - n]);
		
		System.out.println("Min : " + arr[n - 1]);
	}

}
