package Stringss;

public class _14_Remove_Vowels_Possibilities {

	// Method to remove vowels from a string
	static String removeVowels(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I'
					&& ch != 'O' && ch != 'U') {
				result += ch; // Append non-vowel characters
			}
		}
		return result;
	}

	// Method to calculate factorial
	static long factorial(int n) {
		long fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	// Method to calculate number of permutations
	static long calculatePermutations(String str) {
		int length = str.length();
		long permutations = factorial(length);
		return permutations;
	}

	public static void main(String[] args) {
		String input = "HelloWorld";

		// Remove vowels from the string
		String withoutVowels = removeVowels(input);
		System.out.println("String after removing vowels: " + withoutVowels);

		// Calculate the number of permutations
		long permutations = calculatePermutations(withoutVowels);
		System.out.println("Number of possible rearrangements: " + permutations);
	}
}
