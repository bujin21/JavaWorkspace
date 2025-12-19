package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice {
	public void Practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("±¹¾î : ");
		double korean = sc.nextDouble();
		
		System.out.print("¿µ¾î : ");
		double english = sc.nextDouble();
		
		System.out.print("¼öÇÐ : ");
		double math = sc.nextDouble();
		
		int total = (int)(korean + english + math);
		int avg = total / 3 ; 
		System.out.println("ÃÑÁ¡ : " + total);		
		System.out.println("Æò±Õ : " + avg);
	}
}
