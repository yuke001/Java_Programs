package Numbers;

public class _07_RangeOf_Primenumber {

	static void rangePrime() {
		for (int j = 5; j <= 100; j++) {
			int no = j;
			boolean flag = true;
			for (int i = 2; i < no; i++) {
				if (no % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.print(no+"  ");
			
		}

	}
	
	// count of prime numbers
	
	static void countPrime() {
		int count = 0 ;
		for (int j = 5; j <= 100; j++) {
			int no = j; 
			boolean flag = true;
			for (int i = 2; i < no; i++) {
				if (no % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag)
				count++;
		}
		System.out.println(count);

	}

	public static void main(String[] args) {
		rangePrime();
		System.out.println();
		countPrime();

	}

}
