package Numbers;

public class _22_countEven_checkCountEven {
	public static void main(String[] args) {
		int no = 1234567, count = 0;
		while (no > 0) {
			int rem = no % 10;
			if (rem % 2 == 0) {
				count++;
			}
			no /= 10;
		}
		System.out.println("even number count : "+count);
		if (count % 2 == 0)
			System.out.println(count + " is even");
		else
			System.out.println(count + " is odd");
	}

}
