package matrix.programs;

import java.util.ArrayList;

public class addMatrix {
	public static void main(String args[]) {
		int matrixOne[][] = {{1,3,6},{2,8,9},{3,7,2}};
		int matrixTwo[][] = {{1,2,3},{3,5,6},{1,2,3}};
		 int sum = 0;
		 ArrayList<Integer> sumlist = new ArrayList<>();
		  System.out.println("one"+matrixOne.length);
		  System.out.println("two"+matrixTwo.length);
		  
		 for (int i=0; i<matrixOne.length;i++) {
			  for(int j=0;j<matrixTwo.length;j++) {
				  sum = matrixOne[i][j]-matrixTwo[i][j];
				  sumlist.add(sum);
			  }
		 }
	
	 for(Integer num: sumlist) {
		 System.out.println(sumlist);
	 }
	}
}
