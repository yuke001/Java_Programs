package Stringss;

public class _02_Palindrome {
	public static void main(String[] args) {
		String s = "malAyaLAmj" , rev = "" ; 
		for(int i = s.length()-1; i>=0;i--)
			rev = rev+s.charAt(i);
		
		
		String res = (s.equalsIgnoreCase(rev)) ?  s+" palindrome" : s+" not a palindrome" ;
		System.out.println(res);
	}

}
