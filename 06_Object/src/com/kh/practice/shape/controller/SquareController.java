package com.kh.practice.shape.controller;

import com.kh.practice.shape.model.vo.Shape;

public class SquareController {
	private Shape s = new Shape();
	
	public double calcPerimeter(double height, double width) {
		// 매개변수로 넘어온 값을 Shape의 매개변수 있는 생성자에 넣어
		// Shape의 필드들 초기화
		// 둘레 계산법을 통해 계산된 값 반환
		s = new Shape(4,height, width);
		return (width*2) + (height*2);
	}
	
	public double calcArea(double height, double width) {
		// 매개변수로 넘어온 값을 Shape의 매개변수 있는 생성자에 넣어
		// Shape의 필드들 초기화
		// 면적 계산법을 통해 계산된 값 반환
		s = new Shape(4,height, width);
		return height * width;
	}
	public void paintColor(String color) {
		// setter를 통해 매개변수로 넘어온 값으로 변경
		s.setColor(color);
		System.out.println("색이 수정되었습니다");
	}
	public String print() {
		// “사각형” + s.information()으로 삼각형의 정보 리턴
		return "사각형 " + s.information();
	}
}
