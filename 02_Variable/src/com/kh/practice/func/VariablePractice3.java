package com.kh.practice.func;

import java.util.Scanner;

public class VariablePractice3 {
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		
		System.out.println("면적 : " + width * height);
		System.out.println("둘래 : " + (width + height)*2 );
	}
}
