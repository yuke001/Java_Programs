package Numbers;

public class _21_countOdd {
	public static void main(String[] args) {
		int no = 12345, count = 0;
		while (no > 0) {
			int rem = no % 10;
			if (rem % 2 != 0) {
				count++;
			}
			no /= 10;

		}
		System.out.println(count);

	}

}
