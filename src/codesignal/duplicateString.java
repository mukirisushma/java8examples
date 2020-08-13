package codesignal;

import java.util.Arrays;

public class duplicateString {
	
	static void removeDuplicate(char[] s) 
	{
		int n= s.length;
		
		if(n<2)
		{
			return;
	    }
		//to store the index of the String.
		int j=0;
		
		for(int i=1;i<n; i++)
		{
			
			if(s[i]!=s[j])
			{
				j++;
				s[j] = s[i];
			}
		}
		System.out.println(Arrays.copyOfRange(s,0,j+1));
	}
    public static void main(String args[]) {
    	char S1[] ="geeksofgeeks".toCharArray();
    	removeDuplicate(S1);
    	char S2[] = "aabcca".toCharArray();
    	removeDuplicate(S2);
    }
}
