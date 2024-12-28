package com.exception;

public class CustomExceptionImpl {
	public static void main(String[] args) {
		try {
			checkAge(15);
		}catch(MyException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void checkAge(int i) throws MyException {
		if(i<18) {
			throw new MyException("Age must be 18 or more");
		}
		System.out.println("Completed");
	}

}

class MyException extends Exception{
	public MyException(String msg) {
		super(msg);
	}
}
