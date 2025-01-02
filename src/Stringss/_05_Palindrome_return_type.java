package Stringss;

public class _05_Palindrome_return_type {
	
	static String pal(String s) {
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev= rev+s.charAt(i);
			
			if(rev.equalsIgnoreCase(s)) {
				return rev ;
			}
		}
		
		return null ; 
	}

	public static void main(String[] args) {
	String s = "mom" ; 
	
	
	String res = pal(s);
	
	
	if(s.equals(res)) System.out.println("palindrome");
	else System.out.println("not");
	}
}
