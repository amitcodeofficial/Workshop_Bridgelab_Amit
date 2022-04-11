package com.bridgelab.workshop;

public class Rectangle extends Triangle{
//	Variable of Rectangle
	private int breadth;
	private int length;
	private int area;
	
	@Override
	public void area(int breadth, int length) {
		System.out.println("Program to find area of rectangle");
		
		this.breadth=breadth;
		this.length=length;
		
		area=breadth*length;
		System.out.println("Area of rectangle="+area);
		
		System.out.println();
	}
}
