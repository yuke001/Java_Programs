package ArrayList_;

import java.util.TreeSet;

public class _12_All_Missing_Numbers {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 5, 7, 11, 21, 25, 30 };
		
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		
		int start = arr[0];  // 1
//		System.out.println(start);
		
		int end = arr[arr.length-1];   // 30
//		System.out.println(end);   
		
		for(int no : arr) {
			t1.add(no);         //[1, 3, 5, 7, 11, 21, 25, 30]
		}
		
//		System.out.println(t1);
		
		for (int i = start; i <= end; i++) {
			if(!t1.contains(i)) {
				System.out.println(i);
			}
		}
		
		
		
		
		
	}

}
