package Numbers;

public class _04_fibonacci {
	public static void main(String[] args) {
		int no1 = 0, no2 = 1, no3;
		System.out.print(no1 + " " + no2 + " ");

		for (int i = 1; i <= 20; i++) {
			no3 = no1 + no2;

			System.out.print(no3 + " ");

			no1 = no2;
			no2 = no3;

		}
	}

}
