package com.kh.chap02_lambda.part02_practice;

public class LamdaPractice3 {
	public static void main(String[] args) {
		MyFunction<String, String> first = String::toUpperCase; // 문자열을 대문자로 변환
		MyFunction<String, Boolean> second = str -> str.length() >= 5 ; // 문자열 길이 5이상
		MyFunction<String, String> third = str -> {
			String[] arr =str.split("");
			StringBuilder sb = new StringBuilder();
			for(String s: arr) {
				sb.append(s).append("-");
			}
			sb.deleteCharAt(sb.length()-1);
//			String s = "";
//			for(int i = 0; i<str.length(); i++) {
//				if(i >0) {
//					s += "-"+str.charAt(i);
//				}else {
//					s += str.charAt(i);
//				}
//				
//			}
//			return s;
			return sb.toString();
		}; // lamda 일력시 "l-a-m-b-d-a"형태로
		System.out.println(third.apply("lambda"));
	}
	
	@FunctionalInterface
	interface MyFunction<V, B>{
		B apply(V v);
	}
}
