package com.nokia;

import java.util.Arrays;

public class PoliStr {
	public static void main(String[] args) {
		String S = "MadaMM";
		System.out.println(isPoli(S));
		System.out.println("KAJA"+System.lineSeparator()+"VALI");
String input = "MADAM";
        
        // Convert the string to a character array
        char[] chars = input.toCharArray();
        
        // Sort the character array
        Arrays.sort(chars);
        
        // Convert the sorted character array back to a string
        String sortedString = new String(chars);
        
        System.out.println("Original String: " + input);
        System.out.println("Sorted String: " + sortedString);
		
	}
	public static boolean isPoli(String S) {
		int i=0,j=S.length()-1;
		while(i<j) {
			if(S.charAt(i)!=S.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

}
