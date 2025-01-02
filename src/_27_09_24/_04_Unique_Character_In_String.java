package _27_09_24;

public class _04_Unique_Character_In_String {

	public static void main(String[] args) {

		String s = "hhjjcvvarrtkk";

		char[] ch1 = s.toCharArray();
		char[] ch2 = s.toCharArray();

		for (int i = 0; i < ch1.length; i++) {
			boolean flag = true;
//			char ch1  = s.charAt(i);
			for (int j = 0; j < ch2.length; j++) {
//				char ch2 = s.charAt(i);

				if (i != j && ch1[i] == ch2[j]) {
					flag = false;
					break;

				}
			}
			if (flag) {
				System.out.print(ch1[i] + " ");
			}
		}
	}

}
