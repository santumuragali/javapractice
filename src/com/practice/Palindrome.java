package com.practice;

import java.util.Scanner;

public class Palindrome {

	/**
	 * finding given string is palindrome or 
	 * 
	 */
	static String str;
	public static Scanner sc =new Scanner(System.in);
	
	public static void palindrome() {
	
		System.out.println("enter the string ");
		str=sc.nextLine();
		String temp =str;
		String rev ="";
		for(int i=0;i<str.length();i++) {
			rev = rev+str.charAt(i);
		}
		System.out.println(rev);
		if(rev.equalsIgnoreCase(temp)) {
			System.out.println("The give string is palindrome");
		}
		else {
			System.out.println("the given string is not palindrome");
		}
	}
	public static void palindromNumber() {
		int num;
		System.out.println("enter the number ");
		num =sc.nextInt();
		int orginal = num;
		int revnum =0;
		
		while(num>0) {
			int digit  = num%10;
		 revnum =+revnum*10+ digit;
				 num=num/10;
		
		}
		System.out.println(revnum);
	}
	public static void main(String[] args) {
		palindrome();
		palindromNumber();
	}
}
