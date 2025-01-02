package ArrayList_;

public class _13_Rotation_Of_Array_Right_Side {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 }; // arr.length = 5

		int k = 3;

		int j = 0;

		k = k % arr.length;

		for (int i = 0; i < arr.length; i++) {
			if (k < arr.length) {
				System.out.print(arr[k]);
			} else {
				System.out.print(arr[j++]);
			}
		}
	}
}
