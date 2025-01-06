package com.linkedlist;

public class Stack {
	int top;
	int capacity = 3;
	int stack[] = new int[capacity];
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("Stack is full...Increase capacity");
			increase();
		}
		stack[top++]=data;
	}
	
	public void pop() {
		if(isEmpty())
			System.out.println("Stack is empty");
		else {
			top--;
			int data = stack[top];
			stack[top] = 0;
			System.out.println("popped:"+data);
		}
		System.out.println();
	}
	
	public void peek() {
		System.out.println(stack[top-1]);
	}
	private void increase() {
		int[] newStack = new int[capacity*2];
		System.arraycopy(stack, 0, newStack, 0, size());
		stack = newStack;
		capacity = capacity*2;
	}

	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return size()==0;
	}
	
	public boolean isFull() {
		return size()==capacity;
	}
	
	public void show() {
		for(int n:stack)
			System.out.print(n+" ");
		System.out.println();
	}
}
