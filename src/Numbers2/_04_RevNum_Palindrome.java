package Numbers2;

public class _04_RevNum_Palindrome {
	
	public static void main(String[] args) {
		
		int no = 323;
		int no1 = no ;
		int res = 0;

		while (no > 0) {
			int rem = no % 10;
			res = (res * 10) + rem;
			no /= 10;
		}
		if(res == no1)
		System.out.println(no1 + " is palindrome number");
		else
			System.out.println(no1+" not a palindrome number");
	}

}
