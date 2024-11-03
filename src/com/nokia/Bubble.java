package com.nokia;

public class Bubble {
	public static void main(String[] args) {
		int[] arr = {1,21,13,40,76,8,19,11};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			System.out.println();
			for(int num: arr) {
				System.out.print(num+" ");
			}
			
		}
		
		for(int num: arr) {
			System.out.print(num+" ");
		}
	}

}
