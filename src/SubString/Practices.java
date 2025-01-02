package SubString;

import java.util.Arrays;
import java.util.Iterator;

public class Practices {

	static int[] big(int[] a, int[] b) {

		int sum = 0;
		int sum1 = 0;

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		for (int i = 0; i < b.length; i++) {
			sum1 += b[i];
		}

		if (sum > sum1) {
			return a;
		} else if (sum < sum1) {
			return b;
		} else {
			return a;
		}
	}

	static int[] maxx(int[] a) {

		if (a.length > 1) {
			int[] b = new int[2];
			b[0] = a[0];	
			b[1] = a[1];
			return b;
		}
		return a;
	}

	static boolean max1(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if ((a[i] == 1) && (a[i + 1] == 3)) {
				return true;
			}

		}
		return false;
	}
	
	
	
	static boolean yuke(int[]a) {
		if(a.length>=1 && a[0]==a[a.length-1]) {
			return true;
		}
		return false;
		
		
	}

	public static void main(String[] args) {
		
		int[]a= {1,2,1};
		
		if(yuke(a))
		{
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int[] a = {};
//		int[] b = {2,8};
//		
//		
//		if(a.length>=2 && b.length>=2) {
//			int[] temp = new int[2];
//			
//			temp[0] = a[0];
//			temp[1] = b[0] ;
//			
//			for(int no : temp) {
//				System.out.print(no+" ");
//			}
//		}
//		else if(a.length==1 && b.length==1) {
//			int[] temp = new int[2];
//			temp[0] = a[0] ;
//			temp[1] = b[0] ;
//			
//			for(int no : temp) {
//				System.out.print(no+" ");
//			}
//		}
//		else {
//			int[] temp = new int[1];
//			temp[0] = a[0] ;
//			
//			for(int no : temp) {
//				System.out.print(no+" ");
//			}
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		make2([4, 5], [1, 2, 3]) → [4, 5]
//				make2([4], [1, 2, 3]) → [4, 1]
//				make2([], [1, 2]) → [1, 2]
//
//		int[] a = { };
//		int[] b = { 1,2 };
//		
//		int[] temp = new int[2];
//		
//		if(a.length>=2) {
//			temp[0] = a[0] ;
//			temp[1] = a[1] ;
//		}
//		else if(a.length==1) {
//			temp[0] = a[0] ;
//			temp[1] = b[0] ;
//		}else {
//			temp[0] = b[0] ;
//			temp[1] = b[1] ;
//		}
//		
//		for(int no : temp) {
//			System.out.print(no+" ");
//		}
//		
		
		
		
		
		
		
		
		
		

//		int[] a = {2,1,3,4,5};
//		if(max1(a)) {
//			System.out.println("true");
//		}
//		else {
//			System.out.println("false");
//		}

//		
//		for(int no : maxx(a)) {
//			System.out.print(no+" ");
//		}
//		

//		
//		int[] a = {5, 1, 7, 9, 7, 8, 1};
//		
//		int[] b = new int[3];
//			
//		b[0] = a[0] ;
//		b[1] = a[a.length/2] ;
//		b[2] = a[a.length-1] ;
//		
//		int max = 0 ;
//		for (int i = 0; i < b.length; i++) {
//			if(b[i]>max) {
//				max = b[i];
//			}
//		}
//		
//		System.out.println(max);

//		System.out.println(b[0]);
//		System.out.println(b[1]);
//		System.out.println(b[2]);

//		int[] a = { 1,2,3};
//		int[] b = new int[3];
//			
//		b[0] = a[a.length/2-1] ;
//		b[1] = a[a.length/2] ;
//		
//		b[2] = a[a.length/2+1] ;
//		

//		for(int no : b) {
//			System.out.print(no+" ");
//		}
//		

		/// --------------------------------------------------------

//Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.
//
//
//fix23([1, 2, 3]) → [1, 2, 0]
//fix23([2, 3, 5]) → [2, 0, 5]
//fix23([1, 2, 1]) → [1, 2, 1]
//
//		int[] a = {  5,2 , 3 };
//		
//		for (int i = 0; i < a.length; i++) {
//			
//			if(a[i]==2 && a[i+1]==3) {
//				a[i+1]=0;
//			}
//		}
//		
//		for(int no : a) {
//			System.out.print(no+" ");
//		}

//		System.out.println(count);

		// ----------------------------------------

//		int[] a = { 7, 9};
//		boolean flag = false ;
//
//		for (int i = 0; i < a.length; i++) {
//			
//			if(a[i] == 2 || a[i] == 3) {
//				flag = true;
//				break;
//			}
//		}
//		
//		if(flag) {
//			System.out.println("true");
//		}
//		else {
//			System.out.println("false");
//		}

		// ----------------------------------------------------------------------------

//		// o/p : 7 2  -- > 1st and last elements stored in new array
//		int[] nums = {7,3,2};  
//		
//		int temp[] = new int[2];
//		int j =0 ;
//		
//		if(nums.length>1) {
//		temp[0] = nums[0];
//		temp[1] = nums[nums.length-1];
//		}
//		else {
//			temp[0] = nums[0];
//			temp[1] = nums[0];
//		}
//
//		
//		for(int no : temp) {
//			System.out.print(no+" ");
//		}

		// ---------------------------------------------------

//		int[] a = { 1, 2, 3 };
//		int[] b = { 4, 5, 6 };
//
//		int[] temp = new int[a.length - 1];
//		int j = 0;
//
//		for (int i = 0; i < a.length; i++) {
//			if (i == 1) {
//				temp[j++] = a[i];
//			}
//		}
//		for (int i = 0; i < b.length; i++) {
//			if (i == 1) {
//				temp[j++] = b[i];
//			}
//		}
//
//		for (int no : temp) {
//			System.out.print(no + " ");
//		}
	}

}
