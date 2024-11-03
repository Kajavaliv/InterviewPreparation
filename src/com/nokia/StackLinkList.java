package com.nokia;

public class StackLinkList {
	
	StackNode root;
	
	class StackNode{
		int data;
		StackNode next;
		public StackNode(int data) {
			this.data = data;
		}
	}
	
	public boolean isEmpty() {
		if(root==null)
			return true;
		else
			return false;
	}
	
	public void push(int data) {
		StackNode newNode = new StackNode(data);
		if(root==null)
			root = newNode;
		else {
			StackNode tmp = root;
			root = newNode;
			newNode.next = tmp;
		}
	}
	
	public int pop() {
		int popped=Integer.MIN_VALUE;
		if(root==null)
			System.out.println("Stack is empty");
		else {
			popped = root.data;
			root = root.next;
		}
		return popped; 
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack empty");
			return Integer.MIN_VALUE;
		}
		else {
			return root.data;
		}
	}
	
	public void print() {
	    StackNode current = root;  // Use a temporary pointer to traverse the list
	    while (current != null) {
	        System.out.print(current.data+" ");
	        current = current.next;
	    }
	}

	public static void main(String[] args) {
		StackLinkList SL = new StackLinkList();
		SL.push(10);
		SL.push(100);
		SL.push(1000);
		SL.print();
		System.out.println(SL.pop());
		//System.out.println(SL.peek());
		SL.print();
	}
	
	

}
