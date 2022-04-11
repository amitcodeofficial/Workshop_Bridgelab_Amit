package com.bridgelab.workshop;

import java.util.Scanner;

public class Triangle {
	Scanner scan = new Scanner(System.in);
//	Variables for Triangle
	private static float height;
	private static float base;
	private static float area;
	
	public void area(int height, int base) {
		System.out.println("Program to find area of triangle");

		this.height=height;
		this.base=base;
		area=0.5f*height*base;
		
		System.out.println("Area of triangle="+area);
		
		System.out.println();
	}
}
