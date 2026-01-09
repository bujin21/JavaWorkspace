package com.kh.practice.book.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;
import com.kh.practice.book.model.vo.Book;

public class BookDAO {
	private Book[] bArr = new Book[10];
	
	public void fileSave(Book[] bArr) {

		try(ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("phone.txt"));){
			for(Book brr : bArr) {
				oos.writeObject(brr);
			}
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	public Book[] fileRead() {
		try(ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("book.txt"))){
			bArr = (Book[])ois.readObject();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bArr;
	}
}
