package micro.code;

public class Duplicate {

	public static void main(String[] args) {

		String s = "nitin thite pune";
		int count = 0;
		// char[] ch=s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				count++;
			}

		}
		System.out.println(count);
	}

}
