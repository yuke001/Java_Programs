package ArrayList_;

import java.util.Arrays;

public class _16_Largest_Number_In_Array {
	
	public static void main(String[] args) {
		
		int[] arr = {5,3,2,6,6,9,3,8,};
		
		Arrays.sort(arr);
		
		int large = 0; 
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>large) {
				large = arr[i];		
			}	
		}
		System.out.println(large);	
	}}
		
//
//		public class _08_LargestNumber {
//			public static void main(String[] args) {
//				int no = 345634269;
//				int large = 0;
//				while (no > 0) {
//					int rem = no % 10;
//					if (rem > large) {
//						large = rem;
//					}
//					no /= 10;
//				}
//				System.out.println(large);
	

/*
*
*package Test001_String_Frequency;

public class _08_LargestNumber {
	public static void main(String[] args) {
		int no = 345634269;

		int large = 0;

		while (no > 0) {
			int rem = no % 10;
			if (rem > large) {
				large = rem;
			}
			no /= 10;
		}
		System.out.println(large);
	}

}

*/
