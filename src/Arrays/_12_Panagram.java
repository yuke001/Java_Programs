package Arrays;

import java.util.Set;
import java.util.TreeSet;

public class _12_Panagram {

	public static void main(String[] args) {

		String s = "The Quick Brown Fox Jumps over the lazy dog".toLowerCase();

		Set<Character> s1 = new TreeSet<>();

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				s1.add(ch);
			}
		}

		if (s1.size() == 26) {
			System.out.println("Panagram");
		} else {
			System.out.println("not Panagram");
		}

	}

}
