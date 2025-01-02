package Stringss;

// i/p : jAvA    o/p :  JaVa

public class _13_JaVa {
	public static void main(String[] args) {

		String s = "jAvA";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {
				System.out.print((char)(ch+32));
			}
			else if (ch >= 'a' && ch <= 'z') {
				System.out.print((char)(ch-32));
			}
			
		}

	}

}
