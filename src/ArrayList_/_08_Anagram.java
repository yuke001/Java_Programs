package ArrayList_;

import java.util.Arrays;

public class _08_Anagram {

	static boolean ana(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		}

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		if (Arrays.equals(ch1, ch2)) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {

		String s1 = "silent", s2 = "listen";

		boolean res = ana(s1, s2);

		if (res) {
			System.out.println("Anagram");
		} else {
			System.out.println(" not Anagram");
		}
	}

}
