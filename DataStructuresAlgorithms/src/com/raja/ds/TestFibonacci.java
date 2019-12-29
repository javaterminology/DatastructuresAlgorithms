package com.raja.ds;

public class TestFibonacci {

	public static void main(String[] args) {
		//0,1,1,2,3,5,8,13,21,34,55,89,....
		//to find fibonacci series number on 8th position
		int fibno = fibonacci(8);
		System.out.println(fibno);
	}

	private static int fibonacci(int n) {
		
		if(n<1){
			return 0; 
		}else if(n == 1 || n==2){
			return n-1;
		}else{
			return fibonacci(n-1)+fibonacci(n-2);

		}
		
	}

}
