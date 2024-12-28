package com.nokia;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArraySort {
	public static void main(String[] args) {
		Integer[] arr = {2,8,3,7,6,1};
		//Arrays.stream(IntStream.rangeClosed(1, arr.length).map(i->arr[arr.length-i ]).toArray()).forEach(System.out::println);
		Integer[] rev = new Integer[arr.length];
		/*
		 * for(int i=0;i<arr.length;i++) { rev[i]=arr[arr.length-i]; }
		 */
		
		String S = "KAJAVALI";
		//System.out.println(IntStream.range(0, S.length()).mapToObj(i->S.charAt(S.length()-i-1)).map(String::valueOf).collect(Collectors.joining()));
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
