package com.nokia;

public class Insersion {
	
	public static void main(String[] args) {
		int[] arr = {6,5,4,3,2,1};
		for(int num: arr) {
			System.out.print(num+" ");
		}
		
		for(int i=1;i<arr.length;i++) {
			int key = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		for(int num: arr) {
			System.out.print(num+" ");
		}
		
		//Set<String> set = new HashSet<>()
		
		/*
		 * for(int i=1;i<arr.length;i++) { int key = arr[i]; int j=i-1; while(j>=0 &&
		 * arr[j]>key) { arr[j+1]=arr[j]; j--; } arr[j+1]=key; System.out.println();
		 * for(int num: arr) { System.out.print(num+" "); } }
		 */
	}

}
;