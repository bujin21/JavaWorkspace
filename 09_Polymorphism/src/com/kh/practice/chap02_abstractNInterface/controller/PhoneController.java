package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.*;

public class PhoneController {
	private String[] result  = new String[2];
	
	public String[] method() {
		Phone[] p = new Phone[2];
		p[0] = new GalaxyNote9();
		p[1] = new V40();
		for(int i=0; i<p.length; i++) {
			// 1안 downCasting
					//result[i] = ((SmartPhone)p[i]).printformation();
			// 2안 upCasting
			if(p[i] instanceof GalaxyNote9) {
				result[i] = ((GalaxyNote9)p[i]).printformation();
			}else if(p[i] instanceof V40) {
				result[i] = ((V40)p[i]).printformation();
			}
		}
		return result;
	}
}
