package com.kh.operator;

public class C_ddd {
	public void method() {
		
		int num = 4;
		num = num + 3;
		num += 3;
		
		// num값을 3감소 
		num -= 3;
		
		//num값을 7배 증가
		num *= 7;
		
		//num값을 2배 감소
		num /= 2;
		
		//num을 4로 나누었을 때 나머지 값을 num에 대입
		num %= 4;
		
		// +=의 경우 문자열 접합이 가능.
		String str = "Hello ";
		str += "World";  
	}
}
