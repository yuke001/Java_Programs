package _27_09_24;

public class _07_Count_Occurrence_Of_Array {
	
	public static void main(String[] args) {

		int[] arr1 = { 1, 1, 2, 2, 2, 2, 3 };
		
		int x = 2 ; 
		
		int count = 0 ;
			
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i] == x) {
				count++;
			}
		}
		System.out.println(x + " occurs "+count+" times");
		
		
//		String s  ="";
//		for(int no : arr1) {
//			s += String.valueOf(no);	
//		}
//		
//		int[] arr = new int[128];
//		
//		for (int i = 0; i < s.length(); i++) {
//			char ch = s.charAt(i);
//			arr[ch]++;
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i]!=0) {
//				System.out.println((char)i+" "+ arr[i]);
//			}
//		}
		
		
//		System.out.println(s);
				
	
	}

}
