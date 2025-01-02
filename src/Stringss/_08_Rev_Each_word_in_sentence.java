package Stringss;

public class _08_Rev_Each_word_in_sentence {
	static void rev(String s) {
		String rev="";
		for(int i =s.length()-1;i>=0;i--) {
			rev=rev+ s.charAt(i);
		}
		System.out.print(rev+" ");
		
	}
	public static void main(String[] args) {
		String s = "hi how are you";
		String[] s1 = s.split(" ");
		
		for(int i = 0;i<s1.length;i++) {
			rev(s1[i]);
		}
		
	}

}
