package ArrayList_;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class _10_Union_Intersection {

	public static void main(String[] args) {

		ArrayList<Integer> a1 = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 5, 8));
		ArrayList<Integer> a2 = new ArrayList<Integer>(Arrays.asList(1, 6, 7, 4, 9));

		ArrayList<Integer> s1 = new ArrayList<Integer>(a1);
		s1.retainAll(a2);

		System.out.println("InterSection : " + s1);

		Set<Integer> s = new HashSet<>(a1);
		s.addAll(a2);
		System.out.println("Union : " + s);

	}

}
