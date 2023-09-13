package micro.clas;

interface Sayable {
	public String say(int a);
	
}

public class LambdaExpressionExample3 {
	public static void main(String[] args) {
		
		Sayable s = (a) -> {
			System.out.println(a);
			return "I have nothing to say.";
		};
		
		System.out.println(s.say(25));
	}	
}
