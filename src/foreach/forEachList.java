package foreach;
import java.util.List;
import java.util.ArrayList;

// Normal for Eachloop 

public class forEachList {
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
