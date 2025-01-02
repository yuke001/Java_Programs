package _27_09_24;

public class Interger_to_Binary {

	public static void main(String[] args) {

		int no = 4;
		String str = "";
		while(no>0) {
			int rem  = no % 2 ;
			str = rem + str ;
			no /= 2 ;
		}
		System.out.println(str + " is a binary value ");
	}

}
