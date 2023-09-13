package micro.code;

public class Overloading {

	static final private String add(int a, int b) {
		System.out.println(a + "   " + b);
		return "Raju";
	}

	void add(int a, float b) {
		System.out.println(a + "  " + b);
	}

	public static void main(String[] args) {

		Overloading o = new Overloading();
		add(25, 25);
		o.add(25, 2.5F);

	}
	
	public static void main(int[] a) {

		Overloading o = new Overloading();
		Overloading.add(25, 25);
		o.add(25, 2.5F);

	}

}
