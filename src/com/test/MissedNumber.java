package com.test;

import java.util.Arrays;

public class MissedNumber {
	public static void main(String[] args) {
		int[] A = {1,2,3,5,6};		
		int N = A.length+1;
		int sum = Arrays.stream(A).sum();
		int missedNumber = ((N*(N+1))/2)-sum;
		System.out.println(missedNumber);
	}
}
