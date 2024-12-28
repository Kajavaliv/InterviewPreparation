package com.java.dsa;

public class StackDemo {
	public static void main(String[] args) {
		DStack stack = new DStack();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(15);
		stack.push(26);
		stack.push(37);
		
		System.out.println(stack.size());
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		
		
		stack.show();
		
	}

}
