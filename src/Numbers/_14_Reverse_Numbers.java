package Numbers;

public class _14_Reverse_Numbers {
	
	public static void main(String[] args) {
		int no = 987 ; int res = 0 ;
		
		while(no!=0) {
			int rem = no%10;
			System.out.print(rem);
			no = no /10;
		}
	}

}
