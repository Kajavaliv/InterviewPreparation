package com.nokia;

public class SinglyLinkedList {
	
	public static Node insertAtBegin(Node head,int val) {
		Node newNode = new Node(val);
		newNode.next = head;
		head = newNode;
		return head;
	}
	
	public static Node insertAtEnd(Node head, int val) {
		Node newNode = new Node(val);

		if (head == null)
			return newNode;
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}

		last.next = newNode;

		return head;
	}
	
	public static Node insertPosition(Node head, int position, int data) {
		Node newNode = new Node(data);
		if(position == 1) {
			newNode.next = head;
			head = newNode;
			return head;
		}
		Node cur = head;
		for(int i=1;i<position-1 && cur!=null;++i) {
			cur = cur.next;
		}
		
		if(cur == null) {
			return head;
		}
		
		newNode.next = cur.next;
		cur.next = newNode;
		return head;
	}
	
	public static void printList(Node head) {
		Node cur = head;
		while(cur != null) {
			System.out.println(cur.data);
			cur= cur.next;
		}
		System.out.println();
	}
	
	public static Node removeFirst(Node head) {
		if(head == null)
			return null;
		head=head.next;
		return head;
	}
	
	public static Node removeLast(Node head) {
		if(head == null)
			return null;
		if(head.next == null) {
			head = null;
			return null;
		}
		
		Node last = head;
		while(last.next.next !=null) {
			last = last.next;
		}
		
		last.next=null;
		return head;
	}
	
	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		int data = 5;
		head = insertAtBegin(head, 100);
		head = insertAtEnd(head, 200);
		head = insertPosition(head, 3, 300);
		printList(head);
		
		head = removeFirst(head);
		printList(head);
		head = removeLast(head);
		printList(head);
	}
}

class Node{
	int data;
	Node next;
	
	public Node(int val) {
		this.data = val;
		this.next = null;
	}
}
