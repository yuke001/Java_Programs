package Numbers;

public class _02_Swap_two_numbers {
	public static void main(String[] args) {
		int a = 10, b = 20;

		int temp = a;
		a = b;
		b = temp;
		System.out.println(a); // 20
		System.out.println(b); // 10

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a); // 10
		System.out.println(b);// 20
	}
}
