package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		r = new Rectangle(x, y, width, height);
		int area = width * height; 
		return "면적 : "+r.toString()+"/ "+ area;
	}
		
	public String calcPerimeter(int x, int y, int height, int width) {
		r = new Rectangle(x, y, width, height);
		int perimeter = 2*(width + height); 
		return "둘래 : "+r.toString()+"/ "+ perimeter;
	}
}
