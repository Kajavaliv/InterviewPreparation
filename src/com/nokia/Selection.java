package com.nokia;

public class Selection {
	public static void main(String[] args) {
		int[] arr = {1,21,13,40,76,8,19,11};
		int minindex = -1;
		for(int i=0;i<arr.length-1;i++) {
			minindex = i;
			for(int j=i;j<arr.length;j++) {
				if(arr[minindex]>arr[j]) {
					minindex = j;
				}
			}
			int temp = arr[minindex];
			arr[minindex]=arr[i];
			arr[i]= temp;
			System.out.println();
			for(int num:arr) {
				System.out.print(num+" ");
			}
		}
		
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}

}
