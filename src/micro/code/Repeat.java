package micro.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Repeat {

	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
			l.add("Nitin");
			l.add("Raju");
			l.add("Raju");
			l.add("Raju");
			l.add(null);
			l.add("Raju");
			
			Set<String> s=new HashSet<String>(l);
			for (String a : s) {
				System.out.println(a+"  :"+Collections.frequency(l, a));
			}
			


	}

}
