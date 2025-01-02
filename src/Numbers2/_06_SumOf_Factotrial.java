package Numbers2;

public class _06_SumOf_Factotrial {
	
	static void fact(int no) {
		int sum = 0 ;
		int fact =1 ; 
		for(int i=1; i<=no;i++) {
			fact *=i;
			sum = sum + fact ;
			System.out.println(fact);
		
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		int no = 5 ;
		fact(no);
	}

}
