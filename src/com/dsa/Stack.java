package com.dsa;

public class Stack {
	int top = 0;
	int capacity = 3;
	int[] stack = new int[capacity];
	
	public void push(int data) {
		if(size()==capacity)
			expand();
		stack[top++]=data;
	}
	
	public int pop() {
		if(isEmpty())
			System.out.println("Stack is empty....");
		top--;
		int data = stack[top];
		stack[top] = 0;
		return data;
	}
	
	public int peek() {
		
		return stack[top-1];
	}
	
	private void expand() {
		int[] newStack = new int[capacity*2];
		System.arraycopy(stack, 0, newStack, 0, capacity);
		stack = newStack;
		capacity = capacity*2;
	}

	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return top<=0;
	}
	
	public void show() {
		for(int n:stack)
			System.out.print(n+" ");
		System.out.println();
	}

}
