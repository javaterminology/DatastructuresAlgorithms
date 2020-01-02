package com.raja.ds;

public class TimeComplexity4RecursionAlgorithm {

	static int highest = Integer.MIN_VALUE;
	private static int findBiggestNumber(int[] a, int n) {

		if(n==-1){ //O(1)
			return highest;//O(1)
		}else{
			if(a[n]>highest)//O(1)
				highest = a[n];//O(1)
		}
		findBiggestNumber(a, n-1);//O(n)

		return highest;//O(1)
	}

	public static void main(String args[]){
		int[] a = {10,1,8,99,3,4,6};

		int highestNumber = findBiggestNumber(a,a.length-1); //O(1)
		System.out.println(highestNumber);
	}


}
