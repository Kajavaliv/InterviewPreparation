package com.nokia;

import java.util.Stack;

public class Revisit {
	public static void main(String[] args) {
		String S = "madama";
		Stack<Character> st = new Stack<>();
		for(char c:S.toCharArray()) {
			st.push(c);
		}
		
		String RS = "";
		while(!st.isEmpty()) {
			RS+=st.pop();
		}
		System.out.println(RS);
}
	
	
}
