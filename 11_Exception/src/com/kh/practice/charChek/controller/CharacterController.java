package com.kh.practice.charChek.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	public CharacterController() {}
	public int countAlpha(String s) throws CharCheckException{
		// 매개변수로 들어온 값에 있는 영문자를 세어 반환
		// 문자열에 공백이 있다면 CharCheckException발생, 에러 메시지는 출력 값 참고
		
		if(s.contains(" ")) {
			throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
		}
		char[] arr = s.toCharArray();
		int cnt=0;
		for(char ch : arr) {	
			if(ch >= 'A' && ch <='z') {

				cnt++;
			}
		}
		return cnt;
	}
}
