package com.kh.practice.book.view;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	private Book[] bArr;
	
	public BookMenu() {
		bc.makeFile();
		bArr = bc.fileRead();
	}
	
	public void mainMenu() {
		while(true) {
			System.out.println("1. 도서 추가 저장\n"
					+ "2. 저장 도서 출력\n"
					+ "9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1 :
				fileSave();
				break;
			case 2 :
				fileRead();
				break;
			case 9 :
				System.out.println("프로그램 종료");
				return;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		
		
	}
	public void fileSave() {
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		System.out.print("저자명 : ");
		String author = sc.next();
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		System.out.print("출판 날짜(yyyy-mm-dd) : ");
		String date = sc.next();
		System.out.print("할인율 : ");
		double discount  = sc.nextDouble();
		
		String[] sday = date.split("-");
		
		Calendar cal = Calendar.getInstance();
		cal.set(Integer.parseInt(sday[0]),
				Integer.parseInt(sday[1])-1,
				Integer.parseInt(sday[2]));
		
		
		for(int i=0; i<bArr.length+1; i++) {
			if(bArr[i] == null){
				bArr[i] = new Book(title, author, price, cal, discount);
				break;
			}
		}
		bc.fileSave(bArr);

	}
	public void fileRead() {
		Book[] bArr= bc.fileRead();
		for(Book b : bArr) {
			if(b != null) {
				System.out.println(b);
			}
			
		}
	}
}
