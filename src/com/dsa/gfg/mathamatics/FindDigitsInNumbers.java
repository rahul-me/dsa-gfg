package com.dsa.gfg.mathamatics;

public class FindDigitsInNumbers {

	static int countDigitsIterative(long n) {
		int count = 0;
		while(n!=0) {
			n = n/10;
			count++;
		}
		return count;
	}
	
	static int countDigitsRecursive(long n) {
		if(n == 0)return 0;
		return 1 + countDigitsRecursive(n/10);
	}
	
	static double countDigitsLogarithmic(long n) {
		return Math.floor(Math.log10(n) + 1);
	}
	
	public static void main(String[] args) {
		System.out.println(countDigitsIterative(123));
		System.out.println(countDigitsRecursive(123));
		System.out.println(countDigitsLogarithmic(123));
	}
}
