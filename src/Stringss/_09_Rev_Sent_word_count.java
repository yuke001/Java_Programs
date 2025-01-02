package Stringss;

public class _09_Rev_Sent_word_count {
	static void rev(String s) {
		String rev="";
		int count=0;
		for(int i =s.length()-1;i>=0;i--) {
//			rev=rev+ s.charAt(i);
			count++;
			
		}
		System.out.print(count);
		
	}
	public static void main(String[] args) {
		String s = "this is for testing";
		String[] s1 = s.split(" ");
		
		for(int i = 0;i<s1.length;i++) {
			rev(s1[i]);
		}
		
	}

}
