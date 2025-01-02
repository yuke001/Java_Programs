package Numbers;

public class _20_countEven {
	public static void main(String[] args) {
		int no = 1234, count = 0;
		while (no > 0) {
			int rem = no % 10;
			if (rem % 2 == 0) {
				count++;
			}
			no /= 10;

		}
		System.out.println(count);

	}
}
