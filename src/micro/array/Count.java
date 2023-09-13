package micro.array;

import java.util.*;

class Count {

	public static void main(String[] args) {
		List<Character> list = new ArrayList<>();
		char a[] = { 'a', 'b', 'c', 'd', 'e', 'g', 'f' };
		char b[] = { 'x', 'y', 'z', 'a', 'b' };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j])
					list.add(a[i]);

			}
		}
		System.out.println(list);

		int p = 2;
		p = 5;
		p = 522222;

		String n = "java";
		n = "main";
		n = "java";
		n = "public";
	}

}