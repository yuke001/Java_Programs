package Arrays;

import java.util.Scanner;

public class _08_Bubble_Sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array Size : ");
		int size =sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter the " + size+ " array Elements : ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] =sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		
		for(int hi : arr) {
			System.out.print(hi+" ");
		}
		
	}

}
