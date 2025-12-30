package com.kh.example.practice3.model.vo;

public class Circle {
	private final static double PI= 3.14;
	private static int radius = 1;
	
	public Circle() {
	}
	
	public void incrementRadius() {
		radius += 1;
		System.out.println("반지름 1증가 반지름 "+radius);		
	}
	
	public void getAreaOfCircle() {
		//원 둘레
		System.out.println(2*PI*radius);
	}
	public void getSizeOfCircle() {
		//원 넓이
		System.out.println(radius*radius*PI);
	}
}
