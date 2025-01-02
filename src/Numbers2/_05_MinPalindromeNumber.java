package Numbers2;

public class _05_MinPalindromeNumber {
	
	static boolean pal(int no) {
		int no1= no ; 
		int res = 0 ; 
		while(no>0) {
			int rem = no % 10 ; 
			res = (res*10) +rem ; 
			no/=10 ;
		}
		return (no1 == res);
	}
	
	public static void main(String[] args) {
		int no = 228 ;
		
		
		while(no>0) {
			
			if(pal(no)) {
				System.out.println(no);
				break;
			}
			else {
				no--;
			}
		}
	}

}
