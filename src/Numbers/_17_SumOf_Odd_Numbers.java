package Numbers;

public class _17_SumOf_Odd_Numbers {
	public static void main(String[] args) {
		int no = 12354, sum = 0;

		while (no > 0) {
			int rem = no % 10;
			if (rem % 2 != 0) {
				sum += rem;
			}
			no /= 10;

		}
		System.out.println(sum);
	}

}
