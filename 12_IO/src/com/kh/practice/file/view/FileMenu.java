package com.kh.practice.file.view;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1 :
				fileSave();
				break;
			case 2 :
				fileOpen();
				break;
			case 3 :
				fileEdit();
				break;
			case 9 :
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		 
	}
	public void fileSave() {
		StringBuilder sb1 = new StringBuilder();
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String str =sc.nextLine();
			if(str.equals("ex끝it")) {
				break;
			}else {
				sb1.append(str +"\n");
			}
		}
		boolean result = false;
		while(true) {
			System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
			String fn = sc.next();
			result = fc.checkName(fn);
			if(!result) {
				fc.fileSave(fn, sb1);
				mainMenu();
				break;	
			}
			
			System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까? (y/n) : ");
			char ch = sc.next().toUpperCase().charAt(0);
			if(ch == 'Y') {
				fc.fileSave(fn, sb1);
			}else if(ch == 'N') {
				continue;
			}
		}
		
		

		// “ex끝it”를 입력할 때까지 사용자가 입력하게 하고 그 값들을 StringBuilder에 저장
//		저장할 파일 명을 입력해주세요(ex. myFile.txt) :
		// 저장할 파일 명을 사용자에게 받는데 이 때 이미 존재하는 파일 명이라면
		// “이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)”가 출력됨
		// y를 입력하면 FileController(fc)에 fileSave() 메소드로 파일 명과 StringBuilder 넘김
		// n를 입력하면 “저장할 파일 명을 입력해주세요 ~”가 다시 나오게끔 반복
		// 만일 저장할 파일 명이 존재하지 않는 파일 명이었다면
		// 파일 명과 내용을 fc에 fileSave 메소드로 넘김
		
	}
	public void fileOpen() {
		StringBuilder sb = new StringBuilder();
		System.out.print("열 파일 명 : ");
		String fn = sc.next();
		boolean isFn =fc.checkName(fn);
		
		if(!(isFn)) {
			System.out.println("없는 파일입니다");
			return;
		}
		sb = fc.fileOpen(fn);
		
		System.out.println(sb);
	}
	public void fileEdit() {
		StringBuilder sb = new StringBuilder();
		System.out.print("수정할 파일 명 : ");
		String fn = sc.next();
		if( !(fc.checkName(fn) )) {
			System.out.println("없는 파일명입니다.");
			return;
		}
		while(true) {
			System.out.println("파일에 저장할 내용을 입력하세요.");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");
			String str =sc.nextLine();
			if(str.equals("ex끝it")) {
				break;
			}else {
				sb.append(str +"\n");
			}
		}
		fc.fileEdit(fn, sb);
	}
}
