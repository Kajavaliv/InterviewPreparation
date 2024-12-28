package com.test;


public class SampleSpringBootApp {
	
	public void printMsg(int number) {
		if(number%3==0 && number%5!=0)
			System.out.println("Tick");
		else if(number%5==0 && number%3!=0)
			System.out.println("Tack");
		if(number%3==0 && number%5==0)
			System.out.println("Tick Tack");
	}
	
	public static void main(String[] args) {
		SampleSpringBootApp Test = new SampleSpringBootApp();
		Test.printMsg(6);
		Test.printMsg(25);
		Test.printMsg(15);
	}

}
