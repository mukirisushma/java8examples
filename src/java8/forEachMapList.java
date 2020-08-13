package java8;
import java.util.*;


public class forEachMapList {
 public static void main(String args[]) {
	
	 List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		for(String item : items){
			System.out.println(item);
		}
 }
}
