package ArrayList_;

public class _11_First_Positve_Missing_Number {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 5, 6, 7, 8 }; // length = 7

		int n = arr[arr.length - 1]; // n = arr[7-1] ==> n = 8

//		System.out.println("n : "+n);

		int exactSum = n * (n + 1) / 2; // 8 * (8+1)/2 == 36

//		System.out.println("exactSum : "+exactSum);

		int sum = 0;

		for (int no : arr) {
			sum += no; // sum = 33
		}

//		System.out.println("sum :"+sum);

//						      36   - 33   == 3
		System.out.println("The missing Postive No : " + (exactSum - sum));
	}

}
