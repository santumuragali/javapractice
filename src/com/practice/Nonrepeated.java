package com.practice;

import java.util.HashMap;

public class Nonrepeated {
/**
 * first non repetead word
 * 
 */
	
	public static Character nonRepate(String str) {
		HashMap<Character, Integer> count = new HashMap<Character, Integer>();
		
		for(char c : str.toCharArray()){
			count.put(c, count.getOrDefault(c, 0)+1);
		}
		
		for(int i=0;i<str.length();i++) {
			if(count.get(str.charAt(i) )== 1) {
				return str.charAt(i);
			}
			
		}
		 return null;
		
	}
	public static void main(String[] args) {
		String str1= "geeksforgeeks";
		System.out.println("The given word is  "+nonRepate(str1));
	}
}
