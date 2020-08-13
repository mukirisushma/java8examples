package overloading;


public class overload3 {
	
		public void display(int i, char c) {
			System.out.println("Executing the first display"+i+c);
		}
		public void display(char c, int i) {
			System.out.println(" Executing the second display"+c+i);
			
		}

	}
class overloadDemo3
{
	public static void main(String args[]) {
		overload3 obj1= new overload3();
		
		obj1.display(5, 'A');
		obj1.display('B', 6);
	}
}

