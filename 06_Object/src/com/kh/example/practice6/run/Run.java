package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.inform();
		
		Book b2 = new Book("자바의 정석", "이지퍼블리싱", "서우성");
		b2.inform();
		
		Book b3 = new Book("알고리즘", "이지퍼블리싱", "서우성", 25000, 0.5);
		b3.inform();
	}
}
