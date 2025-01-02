package SubString;

public class _01_Program01 {
	
	static void m1() {
		String s = "programming";
		String s1 =s.substring(0,6);
		String s2 =s.substring(6);
		System.out.println(s1);
		String rev="";
		for(int i = s1.length()-1;i>=0;i--) {
			rev+=s1.charAt(i);
		}
		System.err.println(rev+s2);
	}
	
	public static void main(String[] args) {
		
		m1();
		
		String s = "Hello Python programm" ; 
		
		
		System.out.println(s.substring(0,5));
		System.out.println(s.substring(6,12));
		System.out.println(s.substring(13));
	}

}
