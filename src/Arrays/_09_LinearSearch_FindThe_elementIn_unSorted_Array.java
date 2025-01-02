package Arrays;

public class _09_LinearSearch_FindThe_elementIn_unSorted_Array {
	
	static void linearSearch(int[]arr,int no) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == no) {
				System.out.println("value index is : " + i);
				return ;
			}
		}
		System.out.println("not present");
	}
	
	public static void main(String[] args) {
		
		int[] arr= {3,5,1,6,2};
		int no = 1 ;
		
		linearSearch(arr,no) ;

		
	}

}
