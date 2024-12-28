package com.test;

public class FactoryPatternDemo {
	
	public static void main(String[] args) {
		Shape S = shapeFactory.getShape("CIRCLE");
		S.shape();
		
		Shape R = shapeFactory.getShape("RECTANGLE");
		R.shape();
		
		Shape SQ = shapeFactory.getShape("SQUARE");
		SQ.shape();
	}

}

interface Shape{
	public void shape();
}

class Circle implements Shape{

	@Override
	public void shape() {
		System.out.println("Circle shape");		
	}
	
}

class Rectangle implements Shape{

	@Override
	public void shape() {
		System.out.println("Rectangel shape");
		
	}
	
}

class Square implements Shape{

	@Override
	public void shape() {
		System.out.println("Square shape");
		
	}
	
}

class shapeFactory{
	public static Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("CIRCLE"))
			return new Circle();
		if(shapeType.equalsIgnoreCase("RECTANGLE"))
			return new Rectangle();
		if(shapeType.equalsIgnoreCase("SQUARE"))
			return new Square();
		return null;
	}
}
