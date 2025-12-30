package com.kh.practice.shape.model.vo;

public class Shape {
	private int type; // 타입
	private double height; // 높이
	private double width; // 너비
	private String color = "White"; //색깔
	
	public Shape() {
		
	}
	
	public Shape(int type, double height, double width) {
		this.type = type;
		this.height = height;
		this.width = width;
	}
	public String information() {
		String result =height +" "+width + " " + color;	
		return result;
	}
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
