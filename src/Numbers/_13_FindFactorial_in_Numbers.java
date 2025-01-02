package Numbers;

public class _13_FindFactorial_in_Numbers {
	
	static void fact(int no) {
		int fact = 1 ; 
		
		for(int i= 1;i<=no;i++) {
			fact *= i;
		}
		System.out.println(fact);
	}
	
	public static void main(String[] args) {
		int no = 1245 ;
		
		while(no!=0) {
			int rem = no%10;
			fact(rem);
			no = no/10;
		}
	}

}
