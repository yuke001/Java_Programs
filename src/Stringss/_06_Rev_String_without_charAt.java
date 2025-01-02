package Stringss;

public class _06_Rev_String_without_charAt {
	public static void main(String[] args) {
		String s = "java" ; 
		String rev ="";
		char[] ch = s.toCharArray();
		for (int i = ch.length-1; i >=0 ; i--) {
			rev=rev+ch[i];
		}
		System.out.println(rev);
	}

}
