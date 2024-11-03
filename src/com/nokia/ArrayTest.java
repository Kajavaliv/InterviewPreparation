package com.nokia;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int pos = 3;
		int x= 8;
		
		int[] arr1 = new int[arr.length+1];
		for(int i=0;i<pos;i++) {
			arr1[i]=arr[i];
		}
		arr1[pos]=x;
		for(int k=pos;k<arr.length;k++) {
			arr1[k+1]=arr[k];
		}
		
		for(int y=0;y<arr1.length;y++) {
		System.out.println(arr1[y]);
		}
		
		//==========================
		int index = 3;
		int[] arr2 = new int[arr1.length-1];
		for(int i=0;i<index;i++) {
			arr2[i] = arr1[i];
		}
		
		for(int j=index+1;j<arr1.length;j++) {
			arr2[j-1] = arr1[j];
		}
		
		System.out.println("=======================");
		for(int h=0;h<arr2.length;h++) {
			System.out.println(arr2[h]);
		}
	}

}
