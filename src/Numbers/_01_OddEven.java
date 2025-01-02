package Numbers;

import java.util.Scanner;

public class _01_OddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ; 
		
		int no = sc.nextInt();
		
		if(no %2==0) System.out.println(  no + " even");
		else System.out.println(  no + " odd");
		
		
		String s = (no % 2 ==0 ) ? no+" even" : "odd" ;
		
	}

}
