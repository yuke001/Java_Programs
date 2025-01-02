package Frequency;

public class _04_int_Array_Freq {
	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 3, 4, 5, 6, 6, 4, 3, 5 };
		int[] arr = new int[128];

		String s = "";

		for (int i = 0; i < a.length; i++) {
			s += a[i];
		}

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
