package Numbers;

public class _15_Number_Palindrome {
	public static void main(String[] args) {
		int no = 989;
		int no1 = no;
		int res = 0;

		while (no != 0) {
			int rem = no % 10;
			res = (res * 10) + rem;
			no /= 10;
		}
//		System.out.println(res);  

		if (no1 == res) {
			System.out.println(res + " is palindrome");
		} else {
			System.out.println("not pali");
		}
	}
}
