package micro.code;

class Xyz {
	Xyz() {
		System.out.print(1);
	}
}

public class A extends Xyz {

	static {
		System.out.println("Static block");
	}

	A() {
		System.out.print(2);
	}

	int add() {
		System.out.println("hello");
		return 20;
	}

	{
		System.out.println("Welcome to my world");
	}

	public static void main(String[] args) {
		A obj = new A();
		obj.add();
	}

}
