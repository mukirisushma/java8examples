package Heir;

public class Restaurant {
	public static void main(String[] args) {
		Italian obj = new Italian();
		chinese obj1 = new chinese();
		mexican obj2 = new mexican();
		
		System.out.println("In the Mexican Restaurant");
		obj2.DisplayD();
		System.out.println("In the chinese Restaurant");
		obj1.DisplayB();
		System.out.println(" From italian Restaurant");
		obj.DisplayC();
		
		
	}

}
