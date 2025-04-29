package com.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceCharchter {

	/**
	 * i have one string Like ramraj
	 * in this string we need find every word occurenc
	 * logic
	 * Step 1: convert string char array
	 * step 2 creata hash map
	 * step3:use for enhanced for loop push the every charcter in hasp map
	 * step 4:after that creat map entery and getsetkey 
	 * step :5 check the count  
	 */
	public static void duplicate(String str) {
		 str =str.toLowerCase();
		 LinkedHashMap<Character, Integer> Ls = new LinkedHashMap<Character, Integer>();
		 for(char c : str.toCharArray()) {
			 Ls.put(c, Ls.getOrDefault(c, 0)+1);
		 }
		 
		 for(Map.Entry<Character, Integer> entry:Ls.entrySet()) {
			 System.out.println("the key and values "+entry.getKey()+ " the valkues are is "+entry.getValue());
		 }
		 
	}
	
	//without using any inbuild method
	public void duplicateWithoutanyMrthod(String str) {
		str =str.toLowerCase();
		
		int[] count  = new int[256];
		for(int i =0;i<str.length();i++) {
			count[str.charAt(i)]++;
		}
		for(int i =0;i<256;i++) {
		if(count[i]>0) {
			System.out.println("enter the name "+(char)i+ " occurence values are "+count[i]);
		}
		}
	}
	public static void main(String[] args) {
		duplicate("ramraj");
		OccurenceCharchter oc = new OccurenceCharchter();
		oc.duplicateWithoutanyMrthod("snatusoni");
	}
}
