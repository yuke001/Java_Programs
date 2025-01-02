package ArrayList_;

public class _06_Merge_Multiple_Arrays {

	public static void main(String[] args) {

		int[] a1 = { 1, 2, 3, 4 };
		int[] a2 = { 5, 6, 7, 8 };
		
		int[] temp = new int[a1.length + a2.length];

		// System.arrayCopy(Object src, int srcPosition, Object dest, int destPos, int
		// length);

		System.arraycopy(a1, 0, temp, 0, a1.length);
		System.arraycopy(a2, 0, temp, a1.length, a2.length);

		for (int i : temp) {
			System.out.print(i + " ");
		}
	}

}
