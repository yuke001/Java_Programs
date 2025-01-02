package Numbers2;

public class _09_RangeOf_ArmstrongNumber {
	public static void main(String[] args) {

		for (int j = 1; j <= 1000; j++) {

			int no = j;
			int no1 = no;
			int no2 = no;
			int sum = 0;
			int count = 0;

			// find the count

			while (no > 0) {
				int rem = no % 10;
				count++;
				no /= 10;
			}

			// find the sum of multiples of count each number

			while (no1 > 0) {
				int rem = no1 % 10;
				sum += Math.pow(rem, count);
				no1 /= 10;
			}

			if (sum == no2)
				System.out.println(no2);

		}

	}
}
