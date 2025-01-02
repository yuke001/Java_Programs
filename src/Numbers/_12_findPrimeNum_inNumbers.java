package Numbers;

//. WAP to find the prime number in the given numbers - i/p : 3763524 o/p : 3 7 3 5

public class _12_findPrimeNum_inNumbers {

	static void prime(int no) {
		boolean flag = true;
		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.print(no + " ");
		}

	}

	public static void main(String[] args) {
		int no = 3763524;

		while (no != 0) {
			int rem = no % 10;
			prime(rem);
			no = no / 10;
		}
	}

}
