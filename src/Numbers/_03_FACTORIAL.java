package Numbers;

public class _03_FACTORIAL {
	
	static int fact(int no) {
		int  facti = 1;

		for (int i = 1; i <= no; i++)
			facti *= i;

		return facti ;
	}
	
	
	public static void main(String[] args) {
		System.out.println(fact(5));
	}

}
