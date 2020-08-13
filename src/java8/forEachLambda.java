package java8;
import java.util.*;

public class forEachLambda {

	public static void main(String args[]) {
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		
		items.forEach((p,v)->
		System.out.println("Item : " + p + " Count : " + v));
		
		items.forEach((p,v)->{
			System.out.println("Item : " + p + " Count : " + v);
			if("E".equals(p)){
				System.out.println("Hello E");
			}
		});
	}
}
