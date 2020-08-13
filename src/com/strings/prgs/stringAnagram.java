package com.strings.prgs;

import java.util.Arrays;

public class stringAnagram {
	public static void main(String args[]) {
		String str1 ="Few";
		String str2 ="Few";
		
		str1= str1.toLowerCase();
		str2= str2.toLowerCase();
		
		if(str1.length()!= str2.length())
		{
			System.out.println("Both the string are not Anagram");
		}
		else
		{  //converting both the strings into the character array
			char[] string1 = str1.toCharArray();
			char[] string2 = str2.toCharArray();
			Arrays.sort(string1);
			Arrays.sort(string2);
			
			if(Arrays.equals(string1,string2)== true)
			{
				System.out.println("Strings are Anagram");
				
			}else {
			System.out.println("Strings are not anagram");}
		}
		
	}

}
