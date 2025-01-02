package Numbers;

public class _05_PrimeNumber {
	public static void main(String[] args) {
		int no = 15 ; 
		boolean flag = true ; 
		
		for(int i = 2 ; i<no;i++) {
			if(no % i == 0 ) {
				flag =false ;
				break ;
			}
		}
		String s = (flag) ? no+" prime" : no+" not prime" ;
		System.out.println(s);
	}

}
