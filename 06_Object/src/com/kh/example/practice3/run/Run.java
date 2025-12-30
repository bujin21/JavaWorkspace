package com.kh.example.practice3.run;

import com.kh.example.practice3.model.vo.Circle;

public class Run {
	public static void main(String[] args) {
		Circle cr = new Circle();
		cr.getAreaOfCircle(); // 원둘레 출력
		cr.getSizeOfCircle(); // 원 넓이 출력
		
		cr.incrementRadius(); //반 지름 1증가
		
		cr.getAreaOfCircle();
		cr.getSizeOfCircle();
	}
}	
