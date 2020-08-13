package override;

public class parentclass {
	public void mymethod() {
		System.out.println("parent class method");
	}

}

class superEx extends  parentclass{
	public void mymethod() {
		super.mymethod();
		System.out.println("child class method");
	}
	public static void main(String[] args) {
		superEx  obj = new superEx();
		obj.mymethod();
	}
}