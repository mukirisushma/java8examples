package java8;
import java.util.Collection;
import java.util.*;


public class forEachMap {
	public static void main(String args[]) {
	Map<String, Integer> items = new HashMap<>();
	items.put("A", 10);
	items.put("B", 20);
	items.put("C", 30);
	items.put("D", 40);
	items.put("E", 50);
	items.put("F", 60);

	for(Map.Entry<String, Integer> entry : items.entrySet()) {
		System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
	}

}}
