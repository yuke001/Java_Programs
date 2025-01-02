package ArrayList_;

public class _03_First_char_Uppercase {

	public static void main(String[] args) {

		String str = "java is programming language";

		String[] s = str.split(" ");
		String result = "";

		for (int i = 0; i < s.length; i++) {

			String a = s[i].substring(0, 1).toUpperCase();
			String b = s[i].substring(1);

			result+= a + b+" " ;
		}

		System.out.println(result);
	}

}
