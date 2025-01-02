package Numbers2;

public class _08_Disarium_Number {
	public static void main(String[] args) {
		int no = 153, no1 = no, no2 = no, sum = 0, count = 0;

		// count

		while (no > 0) {
			int rem = no % 10;
			count++;
			no /= 10;
		}
		System.out.println(count);

		// sum

		while (no1 > 0) {
			int rem = no1 % 10;
			sum += Math.pow(rem, count);
			count--;
			no1 /= 10;
		}
		System.out.println(sum);

		if (sum == no2)
			System.out.println(no2 + " is disarium number");
		else
			System.out.println(no2 + " is  not disarium number");
	}

}
