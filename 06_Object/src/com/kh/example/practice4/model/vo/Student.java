package com.kh.example.practice4.model.vo;

public class Student {
	public static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	public Student() {}
	static{
		grade = 2;
	}
	{
		classroom=3;
		name = "전부진";
		height = 65.0;
		gender= 'm';
	}
	
	public void information() {
		System.out.println("학년 "+grade);
		System.out.println("반"+classroom);
		System.out.println("이름 "+name);
		System.out.println("몸무게 "+height);
		System.out.println("성별 "+gender);
	}
	
	
}
