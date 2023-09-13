package micro.map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapColl {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,2,3,5,5);
		System.out.println(l);
		Map<String, Integer> m = new HashMap<>();
		m.put("Java", 5000);
		m.put("Paython", 7000);
		m.put("Javacript", 10000);
		m.put("HTML", 5000);
		m.put("HTML", 5000);
		m.put("HTML", 5);

		System.out.println(m);

		Set<Map.Entry<String, Integer>> e = m.entrySet();
		Collection<Integer> g = m.values();
		System.out.println(g);

		for (Entry<String, Integer> a : e) {
			System.out.println(a);
		}

		List<Integer> list=new ArrayList<>(m.values());
		
		System.out.println(list);
	
		
		Set<Integer> i=new HashSet<>(list);
		for (Integer integer : i) {
			System.out.println(integer+"   "+Collections.frequency(list, integer));
			
	
}
	}

}
