package Numbers;

public class _28_CountEven_DoFactorial {
	public static void main(String[] args) {
		int no = 1234564, count = 0;

		while (no > 0) {
			int rem = no % 10;
			if (rem % 2 == 0) {
				count++;
			}
			no /= 10;
		}
		System.out.println("Even number count : " + count);
		int fact = 1;
		if (count % 2 == 0) {
			System.out.println(count + " count is even do factorial");
			for (int i = 1; i <= count; i++) {
				fact *= i;
			}
			System.out.println("count factorial : " + fact);
		} else {
			System.out.println(count + " count is odd can't do factorial");
		}
	}

}
