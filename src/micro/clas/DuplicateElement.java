package micro.clas;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElement {

	public static void main(String tab[]) {

		String a[] = { "java", "string", "paython" };
		String b[] = { "java", "paython", "angular" };

		List<String> c = new ArrayList<String>();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					c.add(a[i]);

				}

			}
			
		}
		System.out.println(c);
	}

}
