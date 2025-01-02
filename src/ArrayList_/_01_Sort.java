package ArrayList_;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _01_Sort {
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList(Arrays.asList(4,2,3,1,5));
		
		Collections.sort(a);
		
		System.out.println(a);
	}

}
