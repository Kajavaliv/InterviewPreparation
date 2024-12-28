package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {
	public static void main(String[] args) {
		SerializeExample S = new SerializeExample(10,"KAJA");
		try(FileOutputStream OS = new FileOutputStream("Test.txt");ObjectOutputStream O = new ObjectOutputStream(OS)){
			O.writeObject(S);
			System.out.println("Processed");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try(FileInputStream FI = new FileInputStream("Test.txt");ObjectInputStream OI = new ObjectInputStream(FI)) {
			SerializeExample E = (SerializeExample) OI.readObject();
			System.out.println(E.toString());
			
		}catch(Exception e){
			
		}
		
		int a=0,b=1,n=20;
		for(int i=0;i<n;i++) {
			System.out.print(a+" ");
			int next = a+b;
			a = b;
			b = next;
		}
	}
}
