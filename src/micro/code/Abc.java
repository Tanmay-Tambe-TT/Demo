package micro.code;


@FunctionalInterface
interface Demo3{
	void add();
}

public class Abc {

	public static void main(String[] args) {
/*
		Runnable a = new Runnable() {
			@Override
			public void run() {
				System.out.println("thread End");

			}
		};
*/
		Runnable a= ()->{
			
			  {
				  synchronized (Thread.class) {
					
				
				System.out.println("thread End");
				for (int i = 0; i <= 10; i++) {
					System.out.println("Value of I=  "+i);
				}
			}
			  }
		};
		
		Demo3 x=()->{
			System.out.println("Demo IS a functional interface");
		};
	
		Thread thread = new Thread(a);

		thread.start();
		System.out.println("thread start");

		System.out.println(thread.getName());

		Thread thread2 = new Thread(a);
		thread2.start();
		System.out.println(thread2.getName());
		
		x.add();	
		
	}
	
}
