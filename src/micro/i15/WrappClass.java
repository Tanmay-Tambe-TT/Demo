package micro.i15;

public class WrappClass {

	public static void main(String[] args) {

		// create primitive types
		int a = 5;
		int c=35;
		double b = 5.65;

		// converts into wrapper objects
		Integer aObj = Integer.valueOf(a);
		Double bObj = Double.valueOf(b);

		if (aObj instanceof Integer) {
			System.out.println("An object of Integer is created.");
		}

		if (bObj instanceof Double) {
			System.out.println("An object of Double is created.");
		}
		
		Integer i=Integer.valueOf(c);
		if(i instanceof Integer) {
			System.out.println("main hu instance");
			
		}else {
			System.out.println("i am nor instance bro please check u r f knowledge");
		}
		
		/////////////////////////////////////
		
		Integer dObj = Integer.valueOf(23);
	    Double eObj = Double.valueOf(5.55);

	    // converts into primitive types
	    int d = dObj.intValue();
	    double e = eObj.doubleValue();

	    System.out.println("The value of a: " + d);
	    System.out.println("The value of b: " + e);
	    
	    
	    String s="200";
	    
	    int f=Integer.valueOf(s);
	    System.out.println(f); 
	    
	    byte x=15;
	    
	    String s1=String.valueOf(x);
	    System.out.println(s1);
	}

}
