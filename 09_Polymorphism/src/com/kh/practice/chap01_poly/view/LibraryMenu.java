package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.*;
import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		// 이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
		// LibraryController의 insertMember() 메소드에 전달
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		char ch = sc.next().charAt(0);
		
		Member mem = new Member(name, age, ch);
		lc.insertMember(mem);
		while(true) {
			System.out.print("==== 메뉴 ====\n"
					+"1. 마이페이지\n"
					+"2. 도서 전체 조회\n"
					+"3. 도서 검색\n"
					+"4. 도서 대여하기\n"
					+"9. 프로그램 종료하기\n"
					+"메뉴 번호 : ");  // 무한 반복 실행
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				lc.myInfo();
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
			}
		}
		
		 
	}
	
	public void selectAll() {
		// LibraryController의 selectAll()메소드 호출하여 결과 값 Book[] 자료형 bList에 담기
		// for문 이용하여 bList의 모든 도서 목록 출력
		// 단, i를 이용하여 인덱스도 같이 출력 → 대여할 때 도서번호를 알기 위해
		//ex ) 0번도서 : 백종원의 집밥 / 백종원 / tvN / true
		Book[] bList = lc.selectAll();
		for(int i=0 ; i<bList.length; i++) {	
			if(bList[i] instanceof CookBook) {
				System.out.println(i +"번도서 : "+((CookBook)bList[i]).toString());
			}else if(bList[i] instanceof AniBook) {
				System.out.println(i +"번도서 : "+((AniBook)bList[i]).toString());
			}
		}
	}
	public void searchBook() {
		
	}
	public void rentBook() {
		
	}
}
