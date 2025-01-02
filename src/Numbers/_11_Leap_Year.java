package Numbers;

public class _11_Leap_Year {
	public static void main(String[] args) {
		int year = 2024 ; 
			
			 if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0 ) {
				 System.out.println(year +" is leap");
			 }
			 else {
				 System.out.println(year +" is not leap");
			 }
	}

}
