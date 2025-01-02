package Numbers;

public class _09_Next_Prime_Number {
	
	static int nextPrime(int no) {
		for(int j = no+1 ; j<=100; j++) {
			int no1 = j ; 
			boolean flag = true ;
			for(int i = 2 ; i<no1;i++) {
				if(no1%i==0) {
					flag= false;
					break;
				}
			}
			if(flag) {
				return no1 ;
			}
		}
		
		return 0 ;
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		int no = 3 ; 
		
		int res = nextPrime(no);
		
		System.out.println(res);
		
	}

}
