package Numbers;

public class _25_MulOf_Odd_Even_Numbers {

	static void mulEven() {
		int no = 123456, mul = 1;
		while (no > 0) {
			int rem = no % 10;
			// mul even numbers
			if (rem % 2 == 0) {
				mul = mul * rem;
			}

			no /= 10;
		}
		System.out.println("mulitiplication of even number :" + mul);

		if (mul % 2 == 0)
			System.out.println(mul + " is even");
		else
			System.out.println(mul + " is odd");
	}

	static void mulOdd() {
		int no = 123456, mul = 1;
		while (no > 0) {
			int rem = no % 10;
			// mul even numbers
			if (rem % 2 != 0) {
				mul = mul * rem;
			}

			no /= 10;
		}
		System.out.println("mulitiplication of Odd number  :" + mul);
		
		if (mul % 2 == 0)
			System.out.println(mul + " is even");
		else
			System.out.println(mul + " is odd");
	}

	public static void main(String[] args) {
		mulEven();
		mulOdd();

	}

}
