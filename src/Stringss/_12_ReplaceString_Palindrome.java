package Stringss;

public class _12_ReplaceString_Palindrome {

	static boolean pal(String s) {
		int si = 0;
		int ei = s.length() - 1;
		while (si < ei) {
			if (s.charAt(si) != s.charAt(ei)) {
				return false;
			}
			si++;
			ei--;
		}
		return true;
	}

	public static void main(String[] args) {
		String s1 = "@123LevE#13l#!";

		String s2 = s1.replaceAll("[^A-za-z]", "");

		String s3 = s2.toLowerCase();

		boolean res = pal(s3);

		if (res)
			System.out.println(s3 + " is palindrome");
		else
			System.out.println(s3 + " is not a palindrome");

	}

}
