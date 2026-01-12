package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	private List<Book> list = new ArrayList();

	public BookController() {
	
	}
	
	public void insertBook(Book bk) {
		list.add(bk);
	}
	public ArrayList selectList() {
		return (ArrayList)list;
	}
	public ArrayList searchBook(String keyword) {
		 List<Book> bl = null;
		for(Book b : list) {
			if(b.getTitle().contains(keyword)) {
				bl.add(b);
			}
		}
		return (ArrayList)bl;
	}
	public Book deleteBook(String title, String author) {
		Book b = new Book();
		return b;
	}
	public int ascBook() {
		return 0;
	}
}
