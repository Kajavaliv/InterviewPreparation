package com.nokia;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {64,23,14,36,10,20};
		
		for(int i=0;i<arr.length-1;i++) {
			int min_index = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min_index])
					min_index = j;
			}
			int tmp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = tmp;
		}
		
		for(int i: arr) {
			System.out.println(i);
		}
	}

}
