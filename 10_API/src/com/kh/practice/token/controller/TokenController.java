package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	public TokenController() {
		
	}
	
	public String afterToken(String str) {
		// "J a v a P r o g r a m "
		// 매개변수로 받아온 str을 StringTokenizer를 이용하여 
	    // 띄어쓰기를 없애고 없앤 문자열 반환
		// 방법1. replace
		System.out.println(str.replace(" ",""));
		// 방법2. split(" ")을 활용하여 " "기준 문자를 분리하고, 분리된 문자를 다시 하나로 합친다.
		String[] arr = str.split(" ");// [j,a,v,a..]
		String result = "";
		for(String s : arr) {
			result += s;
		}
		System.out.println("split : "+result);
		
		// 방법3. StringTokenizer이용
		StringTokenizer st = new StringTokenizer(str, " ");
		String result2 = "";
		while(st.hasMoreTokens()) {
			result2 += st.nextToken();
		}
		 
		return result2;
	}
	
	public String firstCap(String input) {
		// 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환
		// 방법1. substring으로 문자를 하나 빼고, 대문자로 변경후 합쳐서 반환
		String first = input
						.substring(0,1)
						.toUpperCase()
						.concat(input.substring(1));
		
		String other = input.substring(1);
		
		return first;
	}
	
	public int findChar(String input, char one) {
		char[] arr = input.toCharArray();
		int count = 0;
		for(char ch : arr) {
			if(ch == one) {
				count++;
			}
		}
		return count;
	}
	
}