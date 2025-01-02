package Stringss;

//i/p : adjcn - o/p : odkeb  

//i/p : hello o/p : lipps  


public class _11_Type_cast {
	
	public static void main(String[] args) {
		String s = "adjcn" ;
		
		char[] ch = s.toCharArray();
		for(int i = s.length()-1 ; i>=0 ; i--) {
			char ch1 = (char)(ch[i]+1);
			System.out.print(ch1);
		}
		
		System.out.println();
		
		
		
		String s1 = "hello" ; 
		char[] ch1 = s1.toCharArray();
		
		for(int i = 0 ; i < s1.length();i++) {
			char ch3 = (char)(ch1[i]+4);
			System.out.print(ch3);
		}
		
	}

}


