package com.nokia;

public class MergeSort {
	public static void main(String[] args) {
		int[] array1 = {1, 3, 5, 7,11,12,};
        int[] array2 = {2, 4, 6, 8,9};
        
        int[] mergedArr = new int[array1.length+array2.length];
        int i=0,j=0,k=0;
        
        while(i<array1.length && j<array2.length) {
        	if(array1[i]<=array2[j]) {
        		mergedArr[k++]=array1[i++];
        	}else {
        		mergedArr[k++]=array2[j++];
        	}
        }
        
        while(i<array1.length) {
        	mergedArr[k++]=array1[i++];
        }
        
        while(j<array2.length) {
        	mergedArr[k++]=array2[j++];
        }
        
        for(int num:mergedArr) {
        	System.out.print(num+" ");
        }
        
	}

}
