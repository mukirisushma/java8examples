package override;

public class override1 {
   public void display() {
	   System.out.println(" display() method parent class");
	   
   }
}
class child extends override1
{
	public  void  display() {
		System.out.println("display() method  from child class");
	}
	public void newMethod() {
		System.out.println("new method  of the child class ");
	}
	public static void main(String [] args) {
		override1 obj1 =new override1();
		//obj1.display();
		override1 obj2 =new child();
	    obj2.display();
	
	}
}