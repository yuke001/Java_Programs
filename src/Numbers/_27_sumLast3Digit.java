package Numbers;

// i/p : 123456  last 3 digit sum - 15 --> o/p : 12315

public class _27_sumLast3Digit {
	// sum of last 3 digit
	static int numSum(int no) {
		int sum = 0 ; 
		while(no>0) {
			int rem = no % 10 ; 
			sum = sum + rem ; 
			no/=10;
		}
		return sum ;
	}
	
	// mul of last 3 digit
	static int numMul(int no) {
		int mul = 1 ; 
		while(no>0) {
			int rem = no % 10 ; 
			mul = mul * rem ; 
			no/=10;
		}
		return mul ;
	}
	
	
		
	public static void main(String[] args) {
		int no = 123456 ; 
		int no1 = no ; 
		
		// sum of last 3 digit
		int rem = no % 1000 ; // 456 
		no = no / 1000 ;      // 123
		rem = numSum(rem) ; 
		System.out.println(no+""+rem);
		
		
		// mul of last 3 digit
		int rem1 = no1 % 1000 ; 
		no1 = no1/1000;
		rem1 = numMul(rem1);
		System.out.println(no1+""+rem1);
	}
	
	
}
























	/*
	static int numSum(int no) {
		int sum = 0;
		while (no != 0) {
			int rem = no % 10;
			sum = sum + rem;
			no /= 10;
		}
		return sum;

	}

	public static void main(String[] args) {
		int no = 123911;

		int rem = no % 1000;  // it gives last 3 digit - 911
		no /= 1000;           // it gives first 3 digit - 123
		rem = numSum(rem);
		System.out.println(no + "" + rem);

	}
	
	*/


