package overloading;

public class overload {
	public void display(int i) {
		System.out.println(i);
	}
	public void display(int i, String s) {
		System.out.println( i +" " + s);
		
	}

}

class load{
	public static void main(String args[]) {
		overload obj =new overload();
		obj.display(4);
		obj.display(6, "semister");
	}
}
