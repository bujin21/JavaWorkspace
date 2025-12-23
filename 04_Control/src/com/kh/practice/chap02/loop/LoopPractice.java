package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1(){
		
		
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			
			if(num > 1) {
				for(int i = 1; i<= num; i++) {
					System.out.print(i + " ");
				}
				break;
			}else {
				System.out.println("1이상의 숫자를 입력해주세요.");
				continue;
			}
			
		}
	}
	public void practice2(){
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			
			if(num > 1) {
				for(int i = num; i>= 1; i--) {
					System.out.print(i + " ");
				}
				break;
			}else {
				System.out.println("1이상의 숫자를 입력해주세요.");
				continue;
			}
			
		}
	}
	public void practice3(){
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
//		int i = 1;
//		while(num >= i) {
//			sum += i;
//			if(num == i) {
//				System.out.print(i +" = ");
//				break;
//			}else System.out.print(i++ +" + ");
//		}
		
		for(int i = 1; i<=num; i++) {
			sum +=i; // 1부터 정수까지의 합
			System.out.print(i+ (i!=num? " + " : " = "));
		}
		System.out.print(sum);
	}
	public void practice4(){
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		
		if(!(num1 > 0 || num2 > 0)) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice4();
			return;
		}
		int min = num1> num2 ? num2 : num1;
		int max = num1> num2 ? num1 : num2;
		for(int i = min; i<= max; i++) {
			System.out.print(i+ " ");
		}
		
		
//		while(true) {
//			System.out.print("첫 번째 숫자 : ");
//			int num1 = sc.nextInt();
//			System.out.print("두 번째 숫자 : ");
//			int num2 = sc.nextInt();
//			
//			int min = num1> num2 ? num2 : num1;
//			int max = num1> num2 ? num1 : num2;
//			if(!(num1 > 0 || num2 > 0)) {
//				System.out.println("1 이상의 숫자를 입력해주세요.");
//				continue;
//			}
//			
//			
//			for(int i = min; i<= max; i++) {
//				System.out.print(i+ " ");
//			}
//			break;
//		}
		
		
	}
	public void practice5(){
		
		while(true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			if(num >= 10) {
				System.out.println("9이하의 숫자만 입력해주세요.");
				continue;
			}
			for(int dan=num; dan<10; dan++) {
				System.out.println("===="+dan+"단====");
				for(int i =1; i<10; i++) {
					System.out.println(dan + " x "+ i + " = "+ dan*i);
				}
				System.out.println();
			}
			break;
		}
		
	}
	public void practice6(){
		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();
		System.out.print("공차 : ");
		int gong = sc.nextInt();
		
		//10회 반복
		for(int i=0; i<10; i++) {
			System.out.print(num + " ");
			num += gong;
		}
	}
	public void practice7(){
		
		while(true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.next();
			if(op.equals("exit") ) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			
			
			switch(op) {
			case "+" :
				System.out.println(num1 +" + " + num2 + " = " + (num1+num2));
				break;
			case "-" :
				System.out.println(num1 +" - " + num2 + " = " + (num1-num2));
				break;
			case "*" :
				System.out.println(num1 +" * " + num2 + " = " + (num1*num2));
				break;
			case "/" :
				if(num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					continue;
				}
				System.out.println(num1 +" / " + num2 + " = " + (num1/num2));
				break;
			case "%" :
				System.out.println(num1 +" % " + num2 + " = " + (num1%num2));
				break;
			default : 
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				break;
			}
		}
	}
	public void practice8(){
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void practice9(){
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i=num; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void practice10(){
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		boolean so = true;
		if(num > 2) {
			for(int i=2 ; i*i<=num; i++) {
				if(num%i ==0) {
					so = false;
					break;
				}
			}
		}
		else System.out.println("잘못 입력하셨습니다.");
		
		if(so == true)System.out.println("소수입니다.");
		else System.out.println("소수가 아닙니다.");	
		
	}
	public void practice11(){
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		if(num <2) {
			System.out.println("잘못 입력하셨습니다.");
			practice11();
			return;
		}
		int cnt = 0;
		for(int i=2; i<=num; i++) {
			boolean so = true;
			for(int j=2; j*j<=i; j++){
				if(i%j ==0){
					so=false;
					break;
				}
			}
			if(so) {
                System.out.print(i + " ");
                cnt++;
            }
		}
		System.out.println();
		System.out.println("2부터 "+num+"까지의 소수의 개수는 "+cnt+"개입니다.");
	}
	
	public void practice12(){
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		int cnt = 0;
		for(int i=2; i<=num; i++) {
			if(i % 2 == 0 && i % 3 == 0)cnt++;
			else if(i % 2 == 0 || i % 3 == 0)System.out.print(i + " ");
			
		}
		System.out.println("cnt : "+ cnt);
	}
	
}
