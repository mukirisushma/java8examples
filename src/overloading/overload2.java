package overloading;

public class overload2 {
	
		public void display(int i) {
			System.out.println(i);
		}
		public void display(char c) {
			System.out.println(c);
			
		}

	}
class overloadDemo
{
	public static void main(String args[]) {
		overload2 obj1= new overload2();
		
		obj1.display(5);
		obj1.display('A');
	}
}


