package Arrays;

public class _02_Sum_of_EvenIndex_array {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				sum += arr[i] ;
				System.out.println(arr[i]);
			}
		}
		
		System.out.println(sum);
	}

}
