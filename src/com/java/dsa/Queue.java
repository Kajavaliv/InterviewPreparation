package com.java.dsa;

public class Queue {
	int front;
	int rear;
	int size;
	int[] queue = new int[5];
	
	public void enqueue(int data) {
		if(isFull())
			System.out.println("Statck is Full");
		else {
			queue[rear] = data;
			rear = (rear+1)%5;
			size++;
		}
	}
	
	public int dqueue() {
		int data = queue[front];
		if(!isEmpty()) {			
			front = (front+1)%5;
			size--;
		}else {
			System.out.println("Stack is empty");
		}
		return data;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size()==0;
	}
	
	public boolean isFull() {
		return size()==5;
	}
	
	public void show() {
		System.out.print("Elements in Queue: ");
		for(int i=0;i<size;i++) {
			System.out.print(queue[(front+i)%5]+" ");
		}
		System.out.println();
	}

}
