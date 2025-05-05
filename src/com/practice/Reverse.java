package com.practice;

public class Reverse {
	
	public static void rverse(String str) {
		
		String revrse ="";
		for(int i=0;i<str.length();i++) {
			revrse=str.charAt(i)+revrse;
		}
		System.out.println("reverse string is "+revrse);
	}
	public static void main(String[] args) {
		rverse("rahul");
	}

}
