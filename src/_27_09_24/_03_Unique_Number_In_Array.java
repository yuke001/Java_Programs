package _27_09_24;

public class _03_Unique_Number_In_Array {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 1, 5, 2, 6 };

		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				System.out.print(arr[i]+" ");
			}

		}
	}

}
