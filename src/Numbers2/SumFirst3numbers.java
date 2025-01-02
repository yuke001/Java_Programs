package Numbers2;

public class SumFirst3numbers {

	static int numSum(int no) {
		int sum = 0;
		while (no > 0) {
			int rem = no % 10;
			sum = sum + rem;
			no /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {

		int no = 123456;

		int rem = no % 1000; // 456
		no = no / 1000; // 123
		no = numSum(no);
		System.out.println(no + "" + rem);

	}

}
