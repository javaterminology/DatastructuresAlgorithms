package com.raja.ds;

public class TestRecursion {

	public static void foo(int n){
		if(n<1){
			return;
		}else{
			foo(n-1);
		}
		System.out.println("Hello foo! "+n);
	}
	public static void main(String[] args) {

		foo(3);
		System.out.println("Recursion completed!");
	}

}
