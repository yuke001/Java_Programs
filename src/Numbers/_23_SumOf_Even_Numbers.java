package Numbers;

public class _23_SumOf_Even_Numbers {
	public static void main(String[] args) {
		int no =123456 , sum = 0;
		while(no>0) {
			int rem = no % 10;
			if(rem %2==0) {
				sum = sum +rem ;
			}
			no/=10;
		}
		System.out.println("sum of even numbers : " + sum);
	}

}
