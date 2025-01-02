package Arrays;

import java.util.Scanner;

public class _01_Dynamic_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array Size :");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the array Elements  :");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
