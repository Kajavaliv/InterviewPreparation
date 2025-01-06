package com.linkedlist;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		
		list.show();
		
		list.insertAtStart(40);
		list.show();
		
		list.insertAtIndex(2, 50);
		list.show();
		
		list.removeAtStart();
		list.show();
		
		list.removeAtIndex(2);
		list.show();
	}
	
	

}
