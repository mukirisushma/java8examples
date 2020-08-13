package java8;

// lambda expression with no parameter
interface Sayable {
	public  String say();
}

public class LambdaEx1{
	public static void main(String[] args) {
		Sayable s=()->{
		 return  "I have Nothing to say";
		};
		
		System.out.println(s.say());
   }
}
