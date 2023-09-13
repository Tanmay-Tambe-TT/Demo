package micro.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {

		int[] i = { 1, 5, 5, 5, 2, 2, 7 };
		int b[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		ArrayList<Integer> slist = new ArrayList<>();

		for (int j = 0; j < i.length; j++) {
			for (int j2 = 0; j2 < b.length; j2++) {
				if (i[j] == b[j2]) {
					System.out.println(i[j]);
					slist.add(i[j]);
					break;
				}
			}

		}

		Set<Integer> set2 = new HashSet<>(slist);
		System.out.println(set2.toString());

		for (Integer a : set2) {
			System.out.println(a + " : " + Collections.frequency(slist, a));
		}

		// Repeated charachter in String with frequency of that charachter..........

		ArrayList<Character> list = new ArrayList<>();
		String a = "independenceeeee";
		char arr[] = a.toCharArray();
		System.out.println(arr.length);
		for (int j = 0; j < arr.length; j++) {
			for (int j2 = j + 1; j2 < arr.length; j2++) {
				if (arr[j] == arr[j2]) {
					list.add(arr[j]);
					break;

				}
			}
		}
		Set<Character> s = new HashSet<>(list);
		for (Character character : s) {
			System.out.println(character + " " + Collections.frequency(list, character));
		}
	}

}
