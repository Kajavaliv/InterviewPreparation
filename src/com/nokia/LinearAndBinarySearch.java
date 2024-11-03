package com.nokia;

public class LinearAndBinarySearch {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6,8,9,11};
		int v1 = 3;
		int result = linear(arr,v1);
		int left = 0;
		int right = arr.length-1;
		/*
		 * if(result==-1) System.out.println("Element not found"); else
		 * System.out.println("Index="+result);
		 */
		
		int v2 = 9;
		int result1 = binary(arr,v2,0,arr.length-1);
		if(result1==-1)
			System.out.println("Element not found");
		else
			System.out.println("Index="+result1);
			
	}

	private static int binary(int[] arr, int v2,int left, int right) {		
		
		if(left <= right) {
			//steps++;
			int mid = (left+right)/2;
			if(arr[mid]==v2) 				
				return mid;		
			else if(arr[mid]<v2)
				return binary(arr, v2, mid+1, right);
			else
				return binary(arr, v2, left, mid-1);		
		}
		return -1;
	}

	private static int linear(int[] arr, int v1) {
		int steps = 0;
		for(int i=0;i<arr.length;i++) {
			steps++;
			if(arr[i]==v1) {
				//System.out.println("steps="+steps);			
				return i;
			}
		}
		return -1;
	}

}
