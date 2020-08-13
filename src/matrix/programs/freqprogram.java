package matrix.programs;
import java.util.Scanner;

public class freqprogram {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size od the Array");
		int size = sc.nextInt();
		int a[] =new int[size];
		int freq[] = new int[size];
		
		int i,j,count;
		System.out.println("Enter the elements in Array");
		
		for(i=0;i<size;i++)
		{
			a[i] =sc.nextInt();
			freq [i] =-1;
			System.out.println(freq[i]);
	 	}
		
		for (i=0;i<size;i++) {
			count=1;
			for(j=i+1;j<size;j++){
				if(a[i]== a[j]) {
					count++;
					freq[j]=0;
			     }
		    }
			if(freq[i]!=0) {
				freq[i]=count;
			}
		}
		
		System.out.println("frequency of the all the elements");
		System.out.println("elements      |      Frequency");
		for(i=0;i<size;i++) {
			if(freq[i]!=0) {
				System.out.println(a[i]+ "           "+ freq[i]);
				System.out.println();
				
			}
		}
		
		
	}

}
