package Stringss;

public class _03_Rev_no_equals {
	static boolean rev(String s) {

		int si = 0, ei = s.length() - 1;

		while (si < ei) {
			if (s.charAt(si) != s.charAt(ei))
				return false;
			si++;
			ei--;
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "level ";
		boolean res = rev(s);

		String s2 = (res) ? "palindrome" : "not palindrome";
		System.out.println(s2);

	}

}
