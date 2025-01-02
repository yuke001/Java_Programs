package Numbers;

public class _26_Sumof_EvenOdd_ {
	public static void main(String[] args) {
		int no = 1234 ; 
		int sum1 = 0 , sum2 = 0 ; 
		
		while(no>0) {
			int rem = no % 10 ; 
			if(rem % 2==0) {
				sum1 += rem ;
			}
			else if(rem % 2!=0) {
				sum2 += rem ;
				
			}
			
			no/=10;
		}
		System.out.println("sum of even numbers : " +sum1);
		System.out.println("sum of odd  numbers : " +sum2);
		System.out.println("sum of sum1 and sum2 : "+(sum1+sum2));
	}

}
