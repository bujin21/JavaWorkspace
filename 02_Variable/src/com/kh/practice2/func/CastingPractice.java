package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice {
	public void Practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국 : ");
		double kor = sc.nextDouble();
		
		System.out.print("영 : ");
		double eng = sc.nextDouble();
		
		System.out.print("수 : ");
		double math = sc.nextDouble();
		
		int total = (int)(kor + eng + math);
		int avg = total / 3;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
	}
}
