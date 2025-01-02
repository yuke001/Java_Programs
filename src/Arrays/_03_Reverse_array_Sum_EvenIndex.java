package Arrays;

public class _03_Reverse_array_Sum_EvenIndex {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				sum += arr[i];
				System.out.println(arr[i]);
			}
		}

		System.err.println(sum);
		
		// another way to find sum of even index

		int[] a1 = new int[arr.length];
		int j = 0;
		int sum1 = 0;

		for (int i = arr.length - 1; i >= 0; i--) {
			a1[j++] = arr[i];
		}
		for (int i = 0; i < a1.length; i++) {
			if (i % 2 == 0) {
				sum1 += a1[i];
				System.out.println(a1[i]);
			}
		}

		System.err.println(sum1);

	}

}
