package Frequency;

public class _15_UpperCase_Frequency_in_String {

	public static void main(String[] args) {

		String s = "www.PROgRaMMInG@GmAIl.CoM".replaceAll("[^A-Z]", "");

//		s = s.replaceAll("[^A-Z]", "");

//		System.out.println(s1);

		int[] arr = new int[128];

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			arr[ch]++;

		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.println((char) i + " " + arr[i]);
			}
		}

	}

}
