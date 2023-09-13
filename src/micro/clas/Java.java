package micro.clas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

interface InA{
	void add();
}

public class Java


{
	
	class Abc{
		void abc(){
		System.out.println("hello");
		}
	}

	public static void main(String[] args) {
		
		Java ad=new Java();
		Java.Abc b=ad.new Abc();
		b.abc();
		
		Stream<Integer> s1=Stream.of(1,2,3,4,5);
		s1.filter(i->i>2).forEach(i-> System.out.println(i));
		
		List<String> a=Arrays.asList("java","paython","Mongo","c++",".net","cSharp");
		
//		a.add("java");
//		a.add("paython");
//		a.add("Mongo");
//		a.add("c++");
//		a.add(".net");
//		a.add("cSharp");
		
		Stream<String> s2=a.stream();
		s2.filter(c->c.startsWith("c")).forEach(n->System.out.println(n));
		

	}

}
