package micro.code;

class ReturnTypeEx1 {
	public int m1(int a, int b) // Duplicate method error.
	{
		int x = a + b;
		return x;
	}

	public double m1(int c, float d) // Duplicate method error.
	{
		double y = c * d;
		return y;
	}
}

public class ReturnTypeTest {
	public static void main(String[] args) {
		ReturnTypeEx1 obj = new ReturnTypeEx1();
		int sum = obj.m1(20, 30);
		System.out.println(sum);

		int multiply = obj.m1(20, 30);
		System.out.println(multiply);
	}
}
