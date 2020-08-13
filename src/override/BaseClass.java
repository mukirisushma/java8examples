package override;

public class BaseClass {
	// public void disp() then it will not allow 
	protected void  disp() {
		System.out.println(	"parent class method");
	}

}

class ChildClass extends BaseClass
{
	public void disp() { // Protected void disp child class method access attributes shld be less restrictive than the parent class
		System.out.println("child class method");
	}
	
	public static void main(String args[]) {
		 BaseClass obj1 = new BaseClass();
		 obj1.disp();
		 
		ChildClass  obj2 = new ChildClass();
		obj2.disp();
	}
}
