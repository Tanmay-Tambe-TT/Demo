package micro.staticp;

public class StaticP {

	static int a = 20;
	
	public void name() {
		
		this.a=a;
		a=10;
		System.out.println(a);
		System.out.println(this.a=a);
	}

	public static void main(String[] args) {

		StaticP p=new StaticP();
		p.name();
	}

}
