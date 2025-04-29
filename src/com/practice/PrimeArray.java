package com.practice;

import java.util.Scanner;

public class PrimeArray {

	public static boolean isPrime(int num) {
		if(num<=1) return false;
		for(int i =2;i<=num/2;i++)
			return false;
		return true;
	}

	public static void main(String[] args) {
		/*** 
		 * directly we will pass the arrays values 
		 */
		int[] primeNumber = {1,2,3,4};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		System.out.println("enter the values of array");
		int[] primeNumber1 = new int[size];
		for(int i=0;i<size;i++) {
			primeNumber1[i] =sc.nextInt();
		}
		sc.close();
		for(int num : primeNumber1) {
			if(isPrime(num)) {
				System.out.println("the given number is prime "+num);
			}
			else {
				System.out.println("The number is not prime "+num);
			}
		}
	}
}
