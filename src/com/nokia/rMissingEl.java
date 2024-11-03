package com.nokia;

import java.util.Stack;

public class rMissingEl {
	public static void main(String[] args) {
		int[] A = {1,2,3,5,6};
		int sum=0;
		int N = A.length+1;
		for(int i=0;i<A.length;i++) {
			sum = sum+A[i];
		}
		Stack<String> S = new Stack<>();
			
		int M = ((N * (N+1))/2 - sum);
		System.out.println(M);
	}

}
