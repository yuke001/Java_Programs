package ArrayList_;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_ArrayList_BubbleSort{
	
	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(5, 2, 3, 4, 1));

		for (int i = 0; i < a.size() - 1; i++) {
			for (int j = 0; j < a.size() - 1 - i; j++) {

				if (a.get(j) > a.get(j + 1)) {

					int temp = a.get(j);

					a.set(j, a.get(j + 1));

					a.set(j + 1, temp);

				}

			}
		}

		System.out.println(a);
	}

}
