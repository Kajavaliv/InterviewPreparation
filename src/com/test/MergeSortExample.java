package com.test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSortExample {
	public static void main(String[] args) {
		int[] Arr1 = {1,3,5,7,10};
		int[] Arr2 = {2,4,6,8,9};
		
		IntStream.concat(Arrays.stream(Arr1),Arrays.stream(Arr2)).sorted().forEach(System.out::println);
		
		int[] Arr3 = new int[Arr1.length+Arr2.length];
		int i=0,j=0,k=0;
		
		while(i<Arr1.length && j<Arr2.length) {
			if(Arr1[i]<=Arr2[j]) {
				Arr3[k++] = Arr1[i++];
			}else {
				Arr3[k++] = Arr2[j++];
			}
		}
		
		while(i<Arr1.length) {
			Arr3[k++] = Arr1[i++];
		}
		
		while(j<Arr2.length) {
			Arr3[k++] = Arr2[j++];
		}
		
		Arrays.stream(Arr3).forEach(System.out::println);
	}

}
