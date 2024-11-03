package com.nokia;

public class SortA {
	public static void main(String[] args) {
		int[] arr = {1,6,5,8,2};
		
		/*for(int k=0;k<arr.length-1;k++) {
			for(int i=0;i<arr.length-1-k;i++) {
				if(arr[i] > arr[i+1]){
					int tmp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=tmp;
				}
			}
		}
		 
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}*/
		
		int[] arr1 = new int[arr.length-1];
		int index=3;
		for(int i=0;i<index;i++) {
			arr1[i] = arr[i];
		}
		for(int j=index+1;j<arr1.length;j++) {
			arr1[j-1]=arr[j];
		}
		
		for(int i:arr1)
			System.out.println(i);
	}

}
