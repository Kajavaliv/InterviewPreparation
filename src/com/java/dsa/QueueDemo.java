package com.java.dsa;

public class QueueDemo {
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(9);
		q.enqueue(7);
		
		
		q.show();
		q.dqueue();
		q.dqueue();
		q.enqueue(10);
		q.enqueue(11);
		q.enqueue(12);
		q.enqueue(13);
		q.show();
	}

}
