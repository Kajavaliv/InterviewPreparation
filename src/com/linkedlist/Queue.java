package com.linkedlist;

public class Queue {
	int front;
	int rear;
	int size;
	int[] queue = new int[5];
	
	public void enque(int data) {
		if(isFull())
			System.out.println("Queue is full");
		else {
			queue[rear] = data;
			size++;
			rear++;
		}
	}
	
	public int dqueue() {
		int data = 0;// = queue[front];
		if(isEmpty())
			System.out.println("queue is empty");
		else {
			data = queue[front];
			front++;
			size--;
		}
		return data;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public boolean isFull() {
		return size==5;
	}
	
	public void show() {
		for(int i=0;i<size;i++) {
			System.out.print(queue[front+i]+ " ");
		}
		System.out.println();
	}

}
