package micro.clas;

@FunctionalInterface
interface Interf1 {
	String add();

	default void run() {
		System.out.println("Hellow Default Method");
	}
	
	static void put() {
		System.out.println("Static");
	}
}

@FunctionalInterface
interface Interf2 extends Interf1 {
	
	

	
	
}

class A {
	void add() {
		System.out.println("hello");
	}
}

public class ReverseString extends A {

	static {
		System.out.println("java........Static");
	}

	void sub() {
		System.out.println("Child");
	}

	public static void main(String args[]) {

//		String a = "Java", b = "";
//		char c;
//		for (int i = 0; i < a.length(); i++) {
//			c = a.charAt(i);
//			b = c + b;
//		}
//		System.out.println(b);
//
//		A p = new ReverseString();
//		p.add();
//
//		ReverseString q = new ReverseString();
//		q.sub();

		Interf1 x = new Interf2() {

			@Override
			public String add() {
				System.out.println("Ananymous Class method of Interf2");
				
				return "hey add() i have given u first implementation Dont Forgot me I know U have better option to implment but i am the anonymous class";
			}

		};
		System.out.println(x.getClass().getName());
		System.out.println("hey");
		x.add();
		x.run();
		

		Interf2 t2 = () -> {

			return "hey add() u r mine only .... i am lambda Expression";
		};

		System.out.println(t2.add());
		t2.run();
		

		Interf1 t1 = () -> {
			System.out.println("I am Add Method Implementation");
			return "hey add() u r also mine only i have the rights cause i am extending u ....";
		};

		System.out.println(t1.add());
		t1.run();
		
		Interf1.put();

	}

}
