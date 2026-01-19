package com.kh.chap02_lambda.part02_practice;

public class LamdaPractice2 {
	public static void main(String[] args) {
		
		Calculator<Integer> adder = (x,y) -> x*y;  // 두 수의 곱셈결과
		System.out.println(adder.operate(4, 5));
		Calculator<Integer> findMax = (x,y) -> Math.max(x, y); // Math::max // 두 수중 큰 값 반환
		System.out.println(findMax.operate(4, 5));
		Calculator<String> combiner = (str1, str2 ) -> str1+"-"+str2; // "hello", "world" 입력시 
		System.out.println(combiner.operate("hello","world"));		 // "hello-world"가 나오게
		
	}
	
	@FunctionalInterface
	interface Calculator<V>{
		V operate(V c1, V v2);
	}
}
