package com.kh.practice.func;

import java.util.Scanner;

public class VariablePractice4 {
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.next();
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		char ch3 = str.charAt(2);
		
		System.out.println("첫 번째 문자 : "+ ch1);
		System.out.println("두 번째 문자 : "+ ch2);
		System.out.println("세 번째 문자 : "+ ch3);
	}
}
