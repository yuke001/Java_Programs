package Numbers2;

public class _06_PrintPrimNumbers {

	static void prime(int no) {
		boolean flag = true;

		for (int i = 2; i < no; i++) {
			if(no%i==0) {
				flag = false ; 
				break;
			}
		}
		if(flag) {
			System.out.println(no + " is prime");
		}
	}

	public static void main(String[] args) {
		int no = 1237593;

		while (no > 1) {
			int rem = no % 10;
			prime(rem);
			no /= 10;

		}
	}

}
