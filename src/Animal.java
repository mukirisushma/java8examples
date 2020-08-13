
abstract class Test {
	abstract void sayHello();

}
public class Animal extends Test{
	public static void main(String args[]) {
		Test t =new Test();
				t.sayHello();
	}

	@Override
	void sayHello() {
		// TODO Auto-generated method stub
		
	}
	
}