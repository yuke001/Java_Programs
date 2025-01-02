package Arrays;

public class _07_Move_Zero_Last_in_array {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 3, 2, 0, 3, 5, 0, 4 };
		int [] a = new int[arr.length];
		
		int j=0;
		
		for (int i = 0; i < a.length; i++) {
			if(arr[i] !=0 ) {
				a[j++] = arr[i];
			}
		}
		
		
		for(int aa : a) {
			System.out.print(aa);
		}
 
	}

}
