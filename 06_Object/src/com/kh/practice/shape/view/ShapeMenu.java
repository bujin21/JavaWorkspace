package com.kh.practice.shape.view;

import java.util.Scanner;

import com.kh.practice.shape.controller.SquareController;
import com.kh.practice.shape.controller.TriangleController;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();
	
	public void inputMenu() {	
		while(true) {
			System.out.println("===== 도형 프로그램 =====");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			switch(menuNum){
			case 3 :
				triangleMenu();
				break;
			case 4 :
				squareMenu();
				break;
			case 9 :
				System.out.println("프로그램 종료");
				return;
			default :
				System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			}
			
		}
		
	}
	
	public void triangleMenu() {
		System.out.println("===== 삼각형 =====");
		System.out.println("1. 삼각형 면적");
		System.out.println("2. 삼각형 색칠");
		System.out.println("3. 삼각형 정보");
		System.out.println("9. 메인으로");
		while(true) {
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			switch(menuNum) {
			case 1 :
				inputSize(3,1);
				break;
			case 2 :
				inputSize(3, 2);
				break;
			case 3 :
				printInformation(3);
				break;
			case 9 :
				System.out.println("메인으로 돌아갑니다.");
				inputMenu();
				break;
			default :
				System.out.println("잘못된 번호입니다. 다시 입력해주세요");
			}
		}
		
	}
	public void squareMenu() {
		System.out.println("===== 사각형 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 면적");
		System.out.println("3. 사각형 색칠");
		System.out.println("4. 사각형 정보");
		System.out.println("9. 메인으로");
		while(true) {
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			switch(menuNum) {
			case 1 :
				inputSize(4,1);
				break;
			case 2 :
				inputSize(4,2);
				break;
			case 3 :
				inputSize(4,3);
				break;
			case 4 :
				printInformation(4);
				break;
			case 9 :
				System.out.println("메인으로 돌아갑니다.");
				inputMenu();
				break;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요");
			}
		
		}
		
	}
	public void inputSize(int type, int menuNum) {
		
		if( type ==3) {
			if(menuNum == 1) {
				System.out.print("높이 : ");
				double height = sc.nextDouble();
				System.out.print("너비 : ");
				double width = sc.nextDouble();
				double tArea =tc.calcArea(height, width);
				System.out.println("삼각형 면적 : "+tArea);
			}else{
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.next();
				tc.paintColor(color);
			}
				
		}
		
		if(type ==4) {
			if(menuNum == 1) {
				System.out.print("높이 : ");
				double height = sc.nextDouble();
				System.out.print("너비 : ");
				double width = sc.nextDouble();
				double scArea =scr.calcPerimeter(height, width);
				System.out.println("사각형 둘레 : "+scArea);
			}else if(menuNum == 2) {
				System.out.print("높이 : ");
				double height = sc.nextDouble();
				System.out.print("너비 : ");
				double width = sc.nextDouble();
				double scArea =scr.calcArea(height, width);
				System.out.println("사각형 면적 : "+scArea);
			}else{
				System.out.print("색깔을 입력하세요 : ");
				String color = sc.next();
				scr.paintColor(color);
			}
		}
	}
	public void printInformation(int type) {
		if(type == 3) {
			System.out.println(tc.print());
		}else {
			System.out.println(scr.print()); 
		}
	}
	
}
