package Frequency;

public class _01_String_Freq {

	public static void main(String[] args) {
		String s = "anagram";

		int[] arr = new int[128];

		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i)]--;

		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) { // (arr[i] == 1) ---> unique character
				System.out.println((char) i + " " + arr[i]);
			}
		}

	}
}
