package com.linkedlist;

public class LinkedList {
	Node head;
	
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head==null) {
			head = node;
		}else {
			Node n = head;
			if(n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	
	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		node.next = head;
		head = node;
	}
	
	public void insertAtIndex(int index, int data) {
		if(index == 0)
			insertAtStart(data);
		else {
			Node node = new Node();
			node.data = data;
			node.next = null;
			Node n = head;
			
			for(int i=0;i<index-1;i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}
	
	public void removeAtStart() {
		head = head.next;
	}
	
	public void removeAtIndex(int index) {
		if(index == 0)
			removeAtStart();
		else {
			Node n = head;
			Node n1 = null;
			for(int i=0;i<index-1;i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
		}
	}
	
	public void show() {
		Node node = head;
		while(node.next != null) {
			System.out.print(node.data+" ");
			node = node.next;
		}
		System.out.print(node.data);
		System.out.println();
	}

}
