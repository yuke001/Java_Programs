package Numbers;

public class _19_Multiplication_Number {
	public static void main(String[] args) {
		int no = 1234  , mul = 1 ;
		
		while(no >0) {
			int rem = no % 10 ; 
			mul *= rem ;
			no /=10;
		}
		System.out.println(mul);
	}

}
