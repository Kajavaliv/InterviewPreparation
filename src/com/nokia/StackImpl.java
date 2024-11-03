package com.nokia;

public class StackImpl {
	
		int top=-1;
		int capacity = 3;
		int[] A;
		
		public StackImpl() {
			A = new int[capacity];
		}
		
		public void push(int V) {
			if(top>=capacity-1) {
				System.out.println("Over Flow");
				increaseCapacity();
				//return false;
			}
				A[++top]=V;
				System.out.println(V+" is pushed");
				//return true;
						
		}
		
		private void increaseCapacity() {
			int[] B = new int[A.length+1];
			for(int i=top;i>-1;i--) {
				B[i]=A[i];
			}
			A = B;
			
		}

		public int pop() {
			if(top<0) {
				System.out.println("Stsack is empty");
				return 0;
			}else {
				return A[top--];
			}			
		}
		
		public int peek() {
			if(top<0) {
				System.out.println("Stsack is empty");
				return 0;
			}else {
				return A[top];
			}			
		}
		
		public void print() {
			for(int i=top;i>-1;i--) {
				System.out.print(A[i]);
			}
		}
		
		public static void main(String[] args) {
			StackImpl S=new StackImpl();
			S.push(10);
			S.push(20);
			S.push(30);
			S.push(40);
			S.push(50);
			S.print();
			System.out.println(S.pop());
			System.out.println(S.pop());
			System.out.println(S.pop());
			System.out.println(S.pop());
			
			S.print();
		}
	

}
