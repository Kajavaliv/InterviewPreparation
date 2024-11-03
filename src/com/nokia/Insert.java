package com.nokia;

public class Insert {
	public static void main(String[] args) {
		int[] A = {1,2,3,4,5};
		int pos = 3;
		int val = 10;
		int[] B = new int[A.length+1];
		
		for(int i=0;i<pos;i++) {
			B[i]=A[i];
		}
		B[pos]=val;
		for(int k=pos;k<A.length;k++) {
			B[k+1]=A[k];
		}
		
		for(int num:B) {
			System.out.print(num+" ");
		}
	}

}
