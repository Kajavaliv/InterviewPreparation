package com.dsa;
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insert(10);
		list.insert(20);
		list.insert(30);
		
		list.insertAtStart(5);
		list.insertAt(2, 50);
		
		list.show();
		list.removeAt(0);
		
		list.show();
		list.removeAt(3);
		list.show();
	}

}
