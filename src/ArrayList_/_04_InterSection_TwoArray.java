package ArrayList_;

import java.util.ArrayList;
import java.util.Arrays;

public class _04_InterSection_TwoArray {
	
	public static void main(String[] args) {
		
		// in that two arrays 1 and 3 common - intersection
		
		ArrayList a1 = new ArrayList(Arrays.asList(1,2,3,5,6)); 
		ArrayList a2 = new ArrayList(Arrays.asList(4,7,8,3,1)); 
		
		a1.retainAll(a2);
		
		System.out.println(a1);
	}

}
