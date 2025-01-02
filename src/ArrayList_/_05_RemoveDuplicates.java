package ArrayList_;

import java.util.TreeSet;

public class _05_RemoveDuplicates {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 2, 4, 5, 2, 5, 6, 4, 4, 7, 7, 6, 8 };

		// Treeset is autoSorted, and duplicate elements are replace with same value or
		// removed
		TreeSet t = new TreeSet();

		for (int no : arr) {
			t.add(no);
		}

		System.out.println(t);
	}

}
