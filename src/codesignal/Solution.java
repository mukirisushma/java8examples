package codesignal;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
    	int n=s.length();
    	if(n<2)
    	{
    		return 0;
    	}
        int j=0;
    	 for(int i=0;i<s.length();i++) {
    		 for(j= 0;j<s.length();j++)
    		 { //System.out.println(i);
    			 if(s.charAt(i)!=s.charAt(j))
    			 {
    				 j=j+s.charAt(i);
    			 }
    		 }
    	 }
    	// System.out.println("jindex");
 return j;
 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
