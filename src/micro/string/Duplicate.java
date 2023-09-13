package micro.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {

		List<Character> list = new ArrayList<>();
		String a = "independence java ", rev=""; char cha;
		
		for (int i = 0; i < a.length(); i++) {	
			cha=a.charAt(i);
			rev=cha+rev;
		}
		System.out.println(rev);
		char ch[]  = a.toCharArray();
		System.out.println(ch);
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (  ch[i] == ch[j] && ch!=null) {
					list.add(ch[i]);
					break;
				}
			}
		}
		System.out.println(list);
		Set<Character> set=new HashSet<>(list);
		System.out.println(set);
		for (Character character : set) {
			System.out.println(character+" :-  "+Collections.frequency(list, character));
		}

	}

}
