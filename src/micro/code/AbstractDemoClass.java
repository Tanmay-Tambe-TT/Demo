package micro.code;

@FunctionalInterface
interface DemoD{
	void add();
   // abstract void sub();
   // void sub();
   // void add1();
}


abstract class Demo {
	public abstract void run1();

}

public class AbstractDemoClass implements Runnable {

	@Override
	public synchronized void run() {
		System.out.println("Thread ");

		
	}

	public static void main(String[] args) {

		Demo d = new Demo() {

			@Override
			public void run1() {
				System.out.println("hello");

			}
		};

		d.run1();
		
		AbstractDemoClass a=new AbstractDemoClass();
		Thread t=new Thread(a);
		t.start();
	}

}
