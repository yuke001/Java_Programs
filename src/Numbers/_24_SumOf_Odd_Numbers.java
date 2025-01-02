package Numbers;

public class _24_SumOf_Odd_Numbers {

	public static void main(String[] args) {
		int no = 123456, sum = 0;
		while (no > 0) {
			int rem = no % 10;
			if (rem % 2 != 0) {
				sum = sum + rem;
			}
			no /= 10;
		}
		System.out.println("sum of odd numbers : " + sum);
		
		// check sum is odd or even
		
		if(sum %2==0) 
			System.out.println(sum +" is even");
		else
		System.out.println(sum +" is odd");
	}

}
