package com.test;

import java.util.ArrayList;
import java.util.List;

abstract class Shape{
	abstract void draw();
}
class Circle extends Shape{

	@Override
	void draw() {
		System.out.println("drawing Circle");
		
	}
	
}
class Rectangle extends Shape{

	@Override
	void draw() {
		System.out.println("drawing Rectangle");
	}
	
}


public class Test12 {
	static void  drawShapes(List<? extends Shape>  lists) {
		for(Shape s :lists) {
			s.draw();
		}
	}
	static <T extends Shape> void  drawShapes2(List<T>  lists) {
		for(Shape s :lists) {
			s.draw();
		}
	}
	public static void main(String[] args) {
		List<Rectangle> list1 = new ArrayList<Rectangle>();
		list1.add(new Rectangle());
		List<Circle> list2 = new ArrayList<>();
		list2.add(new Circle());
		
		drawShapes(list1);
		drawShapes(list2);
		
		
		
		
	}
	
}
