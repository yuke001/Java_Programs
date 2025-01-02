package SubString;

public class Practice {

	public static void main(String[] args) {

		int[] a = { 1, 3, 2, 5 };

		int min = a[0], max = a[0];

		for (int i = 0; i < a.length; i++) {
			
			if(a[i] > max ) {
				max = a[i];
			}
			if(a[i]<min) {
				min = a[i];
			}
	
	}
		
		System.out.println(min +" "+ max);

}
}
