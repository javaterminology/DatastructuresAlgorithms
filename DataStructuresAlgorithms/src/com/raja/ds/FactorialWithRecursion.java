package com.raja.ds;

public class FactorialWithRecursion {

	public static void main(String[] args) {
		int i = findFactorial(5);
		System.out.println(i);
	}

	private static int findFactorial(int n) {
		if(n == 0){
			return 1;
		}else{
			return n*findFactorial(n-1);
		}
	}

}
