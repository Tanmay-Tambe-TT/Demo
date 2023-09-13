package micro.abstr;

interface abc {
	default void add() {
		System.out.println("Default Add Method");
	}

	static void sub() {
		System.out.println("Static method");
	}

	default void add1() {
		System.out.println("Default add1 method");
	}

	void java();

	void paython();

}

interface xyz {
	
	public default void name() {
		System.out.println("Hellow Abstarct ");
	}
	
}

interface opq {

}

abstract class lmn {

}

abstract class pqr extends lmn {

}

public abstract class Abstarct_Clas extends pqr implements abc, xyz,opq {

	public static void main(String[] args) {
		Abstarct_Clas a = new Abstarct_Clas() {

			@Override
			public void paython() {
				

			}

			@Override
			public void java() {
				

			}
		};

		a.add();
		a.add1();
		a.name();

	}

}
