package Numbers2;

public class _02_Factoral_in_Numbers {
	
	static void fact(int no) {
		int fact = 1 ; 
		for(int i = 1 ;i<=no;i++) {
			fact*=i;
		}
		System.out.println(fact);
	}
	
	
	public static void main(String[] args) {
		int no = 123456 ;
		
		while(no>0) {
			int rem = no % 10 ; 
			fact(rem);
			no/=10;
		}
	}

}
