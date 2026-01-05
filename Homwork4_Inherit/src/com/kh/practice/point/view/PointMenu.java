package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();

	public void mainMenu() {
		/*
		===== 메뉴 =====
		1. 원 ➔ circleMenu()
		2. 사각형 ➔ rectangleMenu()
		9. 끝내기
		메뉴 번호 :
		*/
		while(true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1:
				circleMenu();
				break;
			case 2:
				rectangleMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				return;
			}
		}
		
		
	}

	public void circleMenu() {
		while(true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원 둘레");
			System.out.println("2. 원 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1:
				calcCircum();
				break;
			case 2:
				calcCircleArea();
				break;
			case 9:
				System.out.println("메인으로 이동합니다.");
				mainMenu();
				break;
			}
			break;
		}
		
	}

	public void rectangleMenu() {
		while(true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1:
				calcPerimeter();
				break;
			case 2:
				calcRectArea();
				break;
			case 9:
				System.out.println("메인으로 이동합니다.");
				mainMenu();
				break;
			}
			break;
		}
	}

	public void calcCircum() {
		/*
		x 좌표 :
		y 좌표 :
		반지름 :
		*/
		// 데이터를 CircleController(cc)의 calcCircum()의 매개변수로 보내 반환 값 출력
		
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		
		String result = cc.calcCircum(x, y, radius);
		System.out.println(result);
	}

	public void calcCircleArea() {
		/*
		x 좌표 :
		y 좌표 :
		반지름 :
		*/
		// 데이터를 CircleController(cc)의 calcArea()의 매개변수로 보내 반환 값 출력
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		
		String result = cc.calcArea(x, y, radius);
		System.out.println(result);
	}

	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		
		String result = rc.calcPerimeter(x, y, height,width);
		System.out.println(result);
	}

	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		
		String result = rc.calcArea(x, y, height,width);
		System.out.println(result);
	}
}
