package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;

public class Run {
	public static void main(String[] args) {
		Person p = new Person();
		p.changeName("전부진");
		p.printName();
	}
}
