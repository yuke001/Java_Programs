package Numbers;

public class _08_Range_of_prime_method_with_parameter {

	static int prime(int no) {

		boolean flag = true;

		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			return no;
		}
		return 0;
	}

	public static void main(String[] args) {

		int no1 = 3, no2 = 100;

		for (int j = no1; j <= no2; j++) {

			int res = prime(j);

			if (res > 0) {
				System.out.print(res + " ");
			}
		}
	}

}
