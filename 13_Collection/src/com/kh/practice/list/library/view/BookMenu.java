package com.kh.practice.list.library.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("== Welcome KH Library ==");
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 새 도서 추가"); // insertBook () 실행
			System.out.println("2. 도서 전체 조회"); // selectList ()
			System.out.println("3. 도서 검색 조회"); // searchBook ()
			System.out.println("4. 도서 삭제"); // deleteBook ()
			System.out.println("5. 도서 명 오름차순 정렬"); // ascBook()
			System.out.println("9. 종료"); // “프로그램을 종료합니다.” 출력 후 main()으로 리턴
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				insertBook();
				break;
			case 2:
				selectList();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				deleteBook();
				break;
			case 5:
				ascBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하였습니다.");
			}
		}
		
		
	}
	public void insertBook() {
		
		System.out.println("===== 새 도서 추가 =====");
		System.out.println("책 정보를 입력해주세요.");
		
		System.out.println("도서명 : ");
		String title = sc.next();
		System.out.println("저자명 : ");
		String author = sc.next();
		System.out.println("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타) : ");
		int category = sc.nextInt();
		System.out.println("가격 : ");
		int price = sc.nextInt();
		String cate = "";
		switch(category) {
		case 1 :
			cate = "인문";
			break;
		case 2 :
			cate = "자연과학";
			break;
		case 3 :
			cate = "의료";
			break;
		case 4 :
			cate = "기타";
			break;
		default :
			System.out.println("장르번호를 잘못 입력하였습니다.");
			return;
		}
		bc.insertBook(new Book(title, author, cate, price));
	}
	public void selectList() {
		System.out.println("===== 도서 전체 조회 =====");
		List<Book> list = bc.selectList();
		for(Book b : list) {
			
		}
	}
	public void searchBook() {
		
	}
	public void deleteBook() {
		
	}
	public void ascBook() {
		
	}
}
