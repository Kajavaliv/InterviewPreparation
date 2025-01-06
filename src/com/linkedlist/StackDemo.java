package com.linkedlist;

public class StackDemo {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		
		stack.show();
		stack.pop();
		stack.show();
		
		stack.peek();
	}

}
