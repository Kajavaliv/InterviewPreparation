package com.dsa;

public class StackDemo {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(11);
		stack.push(12);
		stack.push(13);
		
		stack.show();
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		stack.show();
		
	}

}
