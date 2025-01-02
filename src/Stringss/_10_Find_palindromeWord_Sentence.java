package Stringss;

//	 My mom said to learn Malayalam but im from katak place it is in gadag place

public class _10_Find_palindromeWord_Sentence {
	
	static void rev(String s) {
		String rev="";
		for(int i =s.length()-1;i>=0;i--) {
			rev=rev+ s.charAt(i);
		}
		if(rev.equalsIgnoreCase(s))
		System.out.print(s+" ");
		
	}
	public static void main(String[] args) {
		String s = "My mom said to learn Malayalam but im from katak place it is in gadag place";
		String[] s1 = s.split(" ");
		
		for(int i = 0;i<s1.length;i++) {
			rev(s1[i]);
		}
		
	}

}
