package com.oops;

public class AreaDemo {

	public static void main(String[] args) {

		Square square = new Square();
		System.out.println(square.calculateArea(2.00));
		System.out.println(square.calculatePerimeter(3.42));
		
		Rectangle rectangle = new Rectangle();
		System.out.println(rectangle.calculateArea(3, 4));
		System.out.println(rectangle.calculatePerimeter(5, 2));
		
	}

}
