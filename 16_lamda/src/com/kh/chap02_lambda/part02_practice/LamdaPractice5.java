package com.kh.chap02_lambda.part02_practice;

import java.util.function.BiFunction;

public class LamdaPractice5 {
	public static void main(String[] args) {
		BiFunction<Integer,Integer, Integer> 
			op = getOperator("+");
			System.out.println(op.apply(10, 5));
			
			op = getOperator("*");
			System.out.println(op.apply(10, 5));
	}
	
	
	public static BiFunction<Integer, Integer, Integer> getOperator(String type){
		BiFunction<Integer, Integer, Integer> b1 = null;
		// 이부분 구현
		switch(type) {
		case "+" -> b1 =(a, b) -> a+b;
		case "-"-> b1 =(a, b) -> a-b;
		case "*" -> b1 =(a, b) -> a*b;
		case "/"-> b1 =(a, b) -> a/b;
		case "%" -> b1 =(a, b) -> a%b;
		default ->
			throw new RuntimeException("존재하지 않는 연산자입니다.");
		}
		return b1;
	}
}
