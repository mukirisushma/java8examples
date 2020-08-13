package com.strings.prgs;

import java.util.LinkedHashMap;
import java.util.Map;

public class freqCount {
	public static void main(String[] args) {
		frequencyCount("Programming");
		
	}
	public static void frequencyCount(String str) {
		str= str.replace(" ","");
		Map stringCount = new LinkedHashMap <Character, Integer>();
		System.out.print("before in the for loop");
		System.out.println(stringCount);
		
		for(char ch:str.toCharArray()) {
			//System.out.println(ch);
			if(stringCount.containsKey(ch))
			{
				stringCount.put(ch, (Integer)stringCount.get(ch)+1);
				System.out.println(ch);
			} else
			{ 
				stringCount.put(ch,1);
			}
		}
	
        System.out.println(stringCount);
}}
