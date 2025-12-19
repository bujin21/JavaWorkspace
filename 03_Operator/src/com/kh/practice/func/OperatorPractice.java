package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	Scanner sc = new Scanner(System.in);
	public void practice1(){
		System.out.print("인원 수 : ");
		int person = sc.nextInt();
		System.out.print("사탕 개수: ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : "+ candy / person);
		System.out.println("남은 사탕 개수 : "+ candy % person);
	}
	public void practice2(){
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int ban = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int stNum = sc.nextInt(); 
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double record = sc.nextDouble();
		
		System.out.println(grade+"학년 "+ban+"반 "+stNum+"번 "+name+
				(gender == 'm' || gender == 'M' ? " 남학생의 " : (gender == 'f' || gender == 'F')? " 여학생의 " : "(성별잘못입력)")+
				"성적은 "+record+"이다.");
	}
	public void practice3(){
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.println(age <= 13 ? "어린이" : (age > 13 && age <= 19 ?  "청소년" : "성인"));
				
	}
	public void practice4(){
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int meth = sc.nextInt();
		
		int result = kor + eng+ meth;
		double avg = result / 3;
		System.out.println("합계 : "+result);
		System.out.println("평균 : "+avg);
		System.out.println(kor >= 40 && eng >= 40 && meth >= 40 && avg >= 60 ? "합격" : "불합격");
	}
	public void practice5(){
		System.out.print("주민번호를 입력하세요(-포함) : ");
		String resiNum = sc.next();
		char gender = resiNum.charAt(7);
		
		System.out.println(gender == '1' || gender == '3' ? "남자" : (gender == '2' || gender == '4') ? "여자": "주민번호 다시 입력해주세요");
	}
	public void practice6(){
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 : ");
		int iNum = sc.nextInt();
		
		boolean result = iNum < num1 || iNum > num2;
		
		System.out.println(result);
	}
	
	public void practice7(){
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		boolean result = num1 == num2 && num2 == num3;
		System.out.println(result);
	}
	
	public void practice8(){
		double aIncen = 0.4;
		double bIncen = 0.0;
		double cIncen = 0.15;
		System.out.print("A사원의 연봉 : ");
		int aPrice = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int bPrice = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int cPrice = sc.nextInt();
		
		System.out.println("A사원 연봉/연봉+a : "+ aPrice+"/"+(aPrice+(aPrice*aIncen)) );
		System.out.println(aPrice+(aPrice*aIncen) >= 3000 ? "3000 이상" : "3000 미만");
		System.out.println("b사원 연봉/연봉+a : "+ aPrice+"/"+(bPrice+(bPrice*bIncen)) );
		System.out.println(aPrice+(aPrice*bIncen) >= 3000 ? "3000 이상" : "3000 미만");
		System.out.println("c사원 연봉/연봉+a : "+ aPrice+"/"+(cPrice+(cPrice*cIncen)) );
		System.out.println(aPrice+(aPrice*cIncen) >= 3000 ? "3000 이상" : "3000 미만");
	}
}
