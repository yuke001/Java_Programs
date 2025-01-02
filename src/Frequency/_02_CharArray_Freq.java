package Frequency;

public class _02_CharArray_Freq {
	public static void main(String[] args) {
		
		char[] ch1 = { 'P', 'r', 'O', 'g', 'R', 'A', 'M', 'M', 'I', 'n', 'G' };

		int[] arr = new int[128];

		// char to String

		String s = new String(ch1);

//		System.out.println(s);

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			arr[ch]++;       // store
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				System.out.println((char) i + "  " + arr[i]);
			}
		}

	}

}
