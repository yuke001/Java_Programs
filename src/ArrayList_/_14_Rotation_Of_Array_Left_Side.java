package ArrayList_;

public class _14_Rotation_Of_Array_Left_Side {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3 }; // arr.length = 5

		int k = 3;

		k = k % arr.length; // 3

		for (int i = 0; i < arr.length; i++) {
			
//          0,1,2 < 3
		if (i < k) {
//			                arr[   5        + 0 - 3 ]
			System.out.print(arr[arr.length + i - k ] + " ");
			arr[arr.length + i - k ]++;
			continue;
			
		}
		// 3,4 < 3
		else
		{
//			                  arr[4 - 3 ]
			System.out.print(arr[i - k ] + " ");
		}
		}
	}
}

//      0 1 2 3 4  - index
//      1 2 3 4 5  - value

//o/p:  4 5 1 2 3  -- index - 3 4 0 1 2  
//     
//        5 4 3 2 1 -- vlue
//
//               arr[l + i - k ]
//		5>3  --     [5 - 5 + 3 ]  -- 3
//      4>3 ---     [5 - 4 + 3 ] --- 4

//                 arr[ k -i ]
//      3>3 - false - [3 - 3 ]  -- 0    
//      2>3 - false - [3 - 2 ]  -- 1
//      1>3 - false - [3 - 1 ]  -- 2

//                        5  - 3 + 3 

/*
 * System.out.print(arr[(i + k) % n] + " "); arr[ 0 + 3 % 5] -- 3 arr[ 1 + 3 %
 * 5] -4 arr[ 2 + 3 % 5]- 0 arr[ 3 + 3 % 5] - 1 arr[ 4 + 3 % 5] - 2
 * 
 * 
 * 
 * 
 * 
 */
