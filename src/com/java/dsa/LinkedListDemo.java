package com.java.dsa;
import com.java.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insertAtStart(40);
		list.insertAt(2, 55);
		list.insertAt(0, 100);
		list.show();
		System.out.println("==============");
		list.deleteAt(0);
		
		list.show();
	}
}
