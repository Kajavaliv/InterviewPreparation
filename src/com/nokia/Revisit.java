package com.nokia;

public class Revisit {
	public static void main(String[] args) {
		int[] A1 = {1, 3, 5, 7,11,12,};
        int[] A2 = {1,2,3,4,6};
        
        int N = A2.length+1;
        int sum=0;
        for(int n:A2) {
        	sum=sum+n;
        }
        
        System.out.println("SUM:"+sum);
        int miss = ((N *(N+1)/2)-sum);
        System.err.println("Miss:"+miss);
        
        
	}
}
