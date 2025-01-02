package Numbers;

public class _16_Min_Palindrome_in_Numbers {

	static boolean pal(int no) {
		int no1 = no;
		int res = 0;

		while (no != 0) {
			int rem = no % 10;
			res = (res * 10) + rem;
			no /= 10;
		}

		return (res == no1);
	}

	public static void main(String[] args) {
		int no = 338;

		while (no > 0) {
			if (pal(no)) {
				System.out.println(no);
				break;
			} else {
				no--;
			}
		}
	}

}
