package com.raja.ds;

public class TimeComplexity4IterativeAlgorithm {

	public static void main(String[] args) {

		int[] oneDArray = {10,30,1,7,22,11,99,88,77};

		int biggestNumber = findBiggestNumber(oneDArray);
		
		System.out.println("Biggest Number:"+biggestNumber);
		
	}

	private static int findBiggestNumber(int[] oneDArray) {
		
		int biggestNumber = oneDArray[0];//O(1) -----------this is constant time operation - always takes same time
		
		for(int i=1;i<oneDArray.length-1;i++){//O(n) - time taking n units of time to process n elements 
			if(oneDArray[i]>biggestNumber){//O(1) - this is constant time operation - always takes same time
				biggestNumber = oneDArray[i];//O(1)  - this is constant time operation - always takes same time
				// O(1)+O(1) = O(2)
			}
		}//O(2*n) = O(n) ---------------------
		return biggestNumber;//O(1)-------------- this is constant time operation - always takes same time
		
		//O(1)+O(n)+O(1) = O(n) -> we can eliminate constant numbers from time complexity.
		
		//O(1)+O(1) = O(2) is nothing but O(1) AS WELL O(1000) is also equal to O(1)
		//constant values can eliminate while calculate time complexity bcz if suppose to process 1 billion elements
		// takes 1 billion units of time in that if we add additional 1 unit of time so it hardly differs

	}

}
