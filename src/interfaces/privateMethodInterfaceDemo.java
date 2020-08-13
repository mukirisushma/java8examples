package interfaces;
 // D
interface welcomes {
	default void say() {
		sayhello();
	}
	default void sayhello(){
		System.out.println("Hello .... I'm  private method  welcome to edureka");
	}

}
public class  privateMethodInterfaceDemo implements welcomes {
	
	public static void main(String[] args) {
		welcomes s = new privateMethodInterfaceDemo();
		s.say();
	}

	
}

