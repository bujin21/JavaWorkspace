package com.kh.practice.book.controller;

import java.io.File;
import java.io.IOException;

import com.kh.practice.book.model.dao.BookDAO;
import com.kh.practice.book.model.vo.Book;

public class BookController {
	private BookDAO bd = new BookDAO();

	public void makeFile() {
		
		try {
			File f = new File("book.txt");
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		boolean result = f.isFile();
	}
	public void fileSave(Book[] bArr) {
		
	}
	public Book[] fileRead() {
		return bd.fileRead();
	}
}
