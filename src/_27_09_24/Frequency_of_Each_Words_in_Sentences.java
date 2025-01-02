package _27_09_24;

import java.util.HashMap;
import java.util.Map;

public class Frequency_of_Each_Words_in_Sentences {

	public static void main(String[] args) {

		String str = "hi how hi how are you you hi how you you are hi";
		String[] s1 = str.split(" ");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String s : s1) {

			if (map.containsKey(s)) {

				map.put(s, map.get(s) + 1);

			} else {
				map.put(s, 1);
			}
		}

		// another way to write a code
//		for(String s : s1) {
//			map.put(s, map.getOrDefault(s, 0)+1);
//		}

		System.out.println(map);

		for (Map.Entry<String, Integer> x : map.entrySet()) {
			System.out.println(x.getKey() + " " + x.getValue());
		}

	}

}
