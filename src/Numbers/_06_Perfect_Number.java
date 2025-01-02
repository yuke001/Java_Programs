package Numbers;

public class _06_Perfect_Number {
	public static void main(String[] args) {

		for (int j = 1; j <= 10000; j++) {
			int no = j;
			int sum = 0;

			for (int i = 1; i < no; i++) {
				if (no % i == 0) {
					sum += i;
				}
			}

			if (sum == no) {
				System.out.println(no);

			}

		}

	}
}