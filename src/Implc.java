
interface BaseI {
	void method();
}

class BaseC
{
	public void method()
	{
		System.out.println("Incase BaseC:: method");
	}
	
}

public class Implc //extends BaseC implements BaseI
{
 public static void main(String []s) {
	// (new Implc()).method();
//	 int mask =0x000F;
//	 int value = 0x2222;
//	 System.out.println(value & mask);
	 
	 Float f1 =new Float("3.0");
	 int x=f1.intValue();
	 byte b=f1.byteValue();
	 double d=f1.doubleValue();
	 System.out.println(x+b+d);
 }
}