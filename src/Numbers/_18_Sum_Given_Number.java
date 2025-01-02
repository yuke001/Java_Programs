package Numbers;

public class _18_Sum_Given_Number {
	public static void main(String[] args) {
		int no = 1234 ; 
		int sum = 0 ; 
		
		while(no>0) {
			int rem = no % 10 ; 
			sum +=rem ;
			no /=10 ;
		}
		System.out.println(sum);
	}

}
