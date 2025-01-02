package SubString;

import java.util.Scanner;

public class _03_Method_with_ReturnType {
	
	static String rev(String s) {
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		return rev;
	}
	
	public static void main(String[] args) {
		
		//o/p : pecxEnoit
		
		Scanner sc= new Scanner(System.in);
		String str =sc.nextLine();
//		String str ="programming";
//		String str ="Exception" ;
		
		String s1 = str.substring(0,str.length()/2+1);
		String s2 =str.substring(str.length()/2+1);
		
		String a =rev(s1);
		String v =rev(s2);
		
		System.out.println(a+v);
	}

}
