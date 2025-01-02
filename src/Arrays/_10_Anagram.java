package Arrays;

import java.util.Iterator;

public class _10_Anagram {

	static boolean ana(String s1, String s2) {

		if (s1.length() != s1.length()) {
			return false;
		}

		int[] arr = new int[128];

		for (int i = 0; i < s1.length(); i++) {
			char ch1 = s1.charAt(i);
			arr[ch1]++;
		}
		for (int i = 0; i < s2.length(); i++) {
			char ch2 = s2.charAt(i);
			arr[ch2]--;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		String s1 = "java";
		String s2 = "avaj";

		boolean res = ana(s1, s2);
		
		if(res) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("not anagram");
		}
	}

}
