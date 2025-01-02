package ArrayList_;

import java.util.Set;
import java.util.TreeSet;

public class _09_Panagram {

	public static void main(String[] args) {

		String s = "The Quick Brown Fox Jumps Over lazy dog".toLowerCase().replaceAll("[^A-Za-z]", "");
		System.out.println(s.length());

		char[] ch = s.toCharArray();

		Set<Character> s1 = new TreeSet<Character>();
//
//		for (int i = 0; i < s.length(); i++) {
//			char ch = s.charAt(i);
//
//			s1.add(ch);
//
//		}
		for (char ch1 : ch) {
			s1.add(ch1);
		}
		System.out.println(s1.size());

		if (s1.size() == 26) {
			System.out.println("panagram");
		} else {
			System.out.println("not pangram");
		}
	}
}
