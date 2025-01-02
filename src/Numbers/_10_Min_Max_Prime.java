package Numbers;

public class _10_Min_Max_Prime {
	static int minPrime(int a, int b) {
		for (int j = a; j <= b; j++) {
			int no = j;
			boolean flag = true;
			for (int i = 2; i < no; i++) {
				if (no % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				return no;
			}
		}
		return 0;
	}
	
	static int maxPrime(int a, int b) {
		for (int j = b; j >= a; j--) {
			int no = j;
			boolean flag = true;
			for (int i = 2; i < no; i++) {
				if (no % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				return no;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int min = minPrime(3, 100);
		int max = maxPrime(3, 100);
		
		System.out.println(min + " " + max );
		System.out.println(min + max );
	}

}
