package Stringss;

public class _07_Reverse_Sentence {

	public static void main(String[] args) {

		String s = "hi how are you";
		String[] s1 = s.split(" ");

		for (int i = s1.length - 1; i >= 0; i--) {
			System.out.print(s1[i]+" ");
		}

	}

}
