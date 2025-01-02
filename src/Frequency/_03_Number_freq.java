package Frequency;

import java.util.Iterator;

public class _03_Number_freq {
	public static void main(String[] args) {
		
		int no = 1971547999 ;
		
		String s = String.valueOf(no);
		
		int[] arr= new int[128];
		
		for (int i = 0; i < s.length(); i++) {
			char ch  = s.charAt(i);
			arr[ch]++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] !=0) {
				System.out.println((char)i+" "+ arr[i]);
			}
		}
		
		
		 
	}

}
