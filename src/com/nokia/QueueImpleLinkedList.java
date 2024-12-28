package com.nokia;

public class QueueImpleLinkedList {
	class Node{
		Node next;
		int data;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	Node front,rear;
	public QueueImpleLinkedList() {
		front=rear=null;
	}
	
	boolean isEmpty() {
		if(front==null && rear==null) {
			return true;
		}
		return false;
	}
	
	void enqueue(int data) {
		Node newNode = new Node(data);
		if(rear==null) {
			front=rear=newNode;
			return;
		}
		rear.next = newNode;
		rear = newNode;
	}
	
	void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		front = front.next;
		if(front==null) {
			rear=null;
		}
	}
	
	int getFront() {
		return front.data;
	}
	
	int getRear() {
		return rear.data;
	}
	
	public static void main(String[] args) {
		QueueImpleLinkedList Q = new QueueImpleLinkedList();
		
		Q.enqueue(10);
		Q.enqueue(20);
		Q.enqueue(30);
		
		System.out.println(Q.getFront());
		System.out.println(Q.getRear());
		
		Q.dequeue();
		System.out.println(Q.getFront());
	}

}
