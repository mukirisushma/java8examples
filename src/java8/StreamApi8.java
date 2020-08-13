package java8;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class StreamApi8 {
	public static void main(String args[]) {
		
		List<Integer> listOfInt = Arrays.asList(11,3,4,5,7,9,32,21);
		int sum =listOfInt.stream().filter(i-> i>10).mapToInt(i->i).sum();
				System.out.println("Sum +"+ sum);
		
				
			List<String> str = new ArrayList();
			str.add("welcome");
			str.add("to");
			str.add("pradeeps");
			str.add("tutorial");
			
		str.stream().filter(x-> x.length() >7).map(x -> x.toUpperCase()).forEach(x-> System.out.println(x));
			
			
	}

}
 