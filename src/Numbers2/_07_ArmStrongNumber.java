package Numbers2;

public class _07_ArmStrongNumber {
	public static void main(String[] args) {
		int no = 153;
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
		System.out.println("count : "+count);

		// find the sum of multiples of count each number

		while (no1 > 0) {
			int rem = no1 % 10;
			sum += Math.pow(rem, count);
			no1 /= 10;
		}
		System.out.println("sum : "+sum);

		if (sum == no2)
			System.out.println(no2 + " : is  Armstrong number");
		else
			System.out.println(no2 + " : is not a Armstrong number");
	}

}
