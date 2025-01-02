package Numbers2;

public class _01_FindPrime_ingivenNumbers {
	
	static void prime(int no) {
		boolean flag = true ; 
		
		for(int i =2;i<no;i++) {
			if(no%i==0) {
				flag =false;
				break;
			}
		}
		if(flag)
		System.out.print(no+" ");
	}
	
	
	
	public static void main(String[] args) {
		int no = 145732 ;
		
		while(no>0) {
			int rem = no %10;
			prime(rem);
			no/=10;
		}
	}

}
