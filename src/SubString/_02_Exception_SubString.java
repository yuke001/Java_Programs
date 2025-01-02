package SubString;

public class _02_Exception_SubString {
	
	public static void main(String[] args) {
		
		String s = "Exception";  // pecxEtion
		
		String s1 =s.substring(0,s.length()/2+1);
		String s2 =s.substring(s.length()/2+1);
		
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
