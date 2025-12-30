package com.kh.practice.shape.controller;

import com.kh.practice.shape.model.vo.Shape;

public class SquareController {
	private Shape s = new Shape();
	
	public double calcPerimeter(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		return (width*2) + (height*2);
	}
	
	public double calcArea(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		return height * width;
	}
	public void paintColor(String color) {
		s.setColor(color);
		System.out.println("색이 수정되었습니다");
	}
	public String print() {
		return "사각형 " + s.information();
	}
}
