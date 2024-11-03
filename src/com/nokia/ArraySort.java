package com.nokia;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraySort {
	public static void main(String[] args) {
		Integer[] arr = {2,8,3,7,6,1};
		Integer[] rev = new Integer[arr.length];
		/*
		 * for(int i=0;i<arr.length;i++) { rev[i]=arr[arr.length-1-i]; }
		 */
		int start = 0,end=arr.length-1;
		int tmp;
		while(start<end) {
			tmp = arr[start];
			arr[start]=arr[end];
			arr[end]=tmp;
			start++;
			end--;
		}
		
		
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		
		String[] array = {"banana", "apple", "orange", "grape"};
		System.out.println(Arrays.toString(array));
		Arrays.sort(array,new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.length(), o2.length());
			}});
		System.out.println(Arrays.toString(array));
		
	}

}
