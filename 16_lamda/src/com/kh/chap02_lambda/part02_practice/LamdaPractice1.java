package com.kh.chap02_lambda.part02_practice;

public class LamdaPractice1 {
	public static void main(String[] args) {
		String[] arr = {"java", "lambda", "hi", "functional", "wow"};
		printStrings(arr, str -> str.length() <= 3  ); // 1. 길이가 3이하인 문자열
		printStrings(arr, str -> str.contains("a")  );	// 2. a가 포함된 문자열
		printStrings(arr, str -> str.startsWith("w")  ); // 3. w로 시작하는 문자열
		printStrings(arr, str -> str.length() % 2 == 0 && str.contains("a")  );	// 4. 짝수면서 a가 포함된 단어
		
		}
	public static void printStrings(String[] arr, StringChecker checker) {
		for(String str : arr) {
			if(checker.check(str)) {
				System.out.println(str);
			}
		}
	}
	@FunctionalInterface
	interface StringChecker{
		boolean check(String str);
	}
}
