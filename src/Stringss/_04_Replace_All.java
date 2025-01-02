package Stringss;

public class _04_Replace_All {
	public static void main(String[] args) {
		// replace old char to new char
		String s = "Watch the Wall".replace('W', 'C');
		System.out.println(s);

		// remove the extra space in the sentence
		String s1 = "   hello java   hello    world   ".replaceAll(" +", " ");
		System.out.println(s1);

		// remove the special character and numbers

		String s2 = "#P12rO34!gR@Amm78iNg".replaceAll("[@#!0-9]", "");

		System.out.println(s2);

		// i/p : #Move#Hast#toFirst o/p : ###MoveHashtoFirst

		String s3 = "#Move#Hast#toFirst";
		String s4 = s3.replaceAll("[^#]", "");
		String s5 = s3.replaceAll("[^A-za-z]", "");

		System.out.println(s4 + s5);
		
//		Check the given String is palindrome or not - i/p : "123Le23!3V$E89l23" o/p - level
		
		String str = "123Le23!3V$E89l23".replaceAll("[^A-za-z]", "") ;
		String rev="";
		
		for(int i = str.length()-1;i>=0;i--) {
			rev += str.charAt(i);
		}
		if(rev.equalsIgnoreCase(str)) System.out.println("palindrome :" + str.toLowerCase());
		else System.out.println("not a palindrome");
		

	}

}
