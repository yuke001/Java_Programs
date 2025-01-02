package _27_09_24;

public class Test {

	public static void print(char ch1, char ch2) {

		int no = (int) (ch2 - 48);

		for (int i = 1; i <= no; i++) {
			System.out.print(ch1);
		}

	}

	public static void main(String[] args) {

		String s = "a3b2c4";

		for (int i = 0; i < s.length(); i = i + 2) {
			print(s.charAt(i), s.charAt(i + 1));
		}
		
		System.out.println();
		//------------------------------------
		
		
		int[] nums = {7}; int sum = 0; 
		

	

	}

}
