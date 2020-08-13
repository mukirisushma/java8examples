package overloading;

public class typepromote {
	void display(int a, double b) {
		System.out.println("Function one");
	}
	void disp(int a, double b, double c) {
		System.out.println("Function two");
	}
    public static void main(String[] args) {
    	typepromote obj =new typepromote();
    	obj.display(2, 12.34f);
    }
}
