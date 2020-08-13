package com.strings.prgs;

public class spaceString {
	public static void main(String[] args) {
		String ss= "you are the future decider";
		 int count=0;
		 
		 for(int i=0;i<ss.length();i++)
		 {
			if(ss.charAt(i)!= ' ') 
				count++;
		 }
	System.out.println(" the string"+ count);	
	//System.out.println(" the string"+ ss.length());

	}
}
