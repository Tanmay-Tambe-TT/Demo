package micro.code;

import java.util.ArrayList;

@FunctionalInterface
interface Java {
	void add();
}

public class Constr {

	public static void main(String[] args) {
		
		ArrayList<Character> list = new ArrayList<>();
		String a="independence";
		char arr[]=a.toCharArray();
		System.out.println("");
		System.out.println(arr.length);
		for (int j = 0; j < arr.length; j++) {
			for (int j2 = j+1; j2 < arr.length; j2++) {
				if (arr[j]==arr[j2]) {
					list.add(arr[j]);
					break;
				}
			}
			
		}
		
		System.out.println(list); 

		Java j = () -> {
			for (int i = 0; i <= 20; i++) {
				System.out.println(i);
			}
		};
		j.add();

	}

}
