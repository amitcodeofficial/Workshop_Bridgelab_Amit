package com.bridgelab.workshop;

public class Square extends Triangle{
//	Variable of Square
	private static int side;
	private static int area;
	
	public void area(int side) {
		System.out.println("Program to find area of square");
		this.side=side;
		
		area=side*side;
		
		System.out.println("Area of square="+area);
		
		System.out.println();
	}
}
