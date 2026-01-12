package com.kh.practice.list.music.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 마지막 위치에 곡 추가"); // addList() 실행
			System.out.println("2. 첫 위치에 곡 추가"); // addAtZero()
			System.out.println("3. 전체 곡 목록 출력"); // printAll()
			System.out.println("4. 특정 곡 검색"); // searchMusic()
			System.out.println("5. 특정 곡 삭제"); // removeMusic()
			System.out.println("6. 특정 곡 정보 수정"); // setMusic()
			System.out.println("7. 곡명 오름차순 정렬"); // ascTitle()
			System.out.println("8. 가수명 내림차순 정렬"); // descSinger()
			System.out.println("9. 종료"); // “종료” 출력 후 main()으로 리턴
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1:
				addList();
				break;
			case 2:
				addAtZero();
				break;
			case 3:
				printAll();
				break;
			case 4:
				searchMusic();
				break;
			case 5:
				removeMusic();
				break;
			case 6:
				setMusic();
				break;
			case 7:
				ascTitle();
				break;
			case 8:
				descSinger();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				
			}
		}
		
		// 메뉴 화면 반복 실행 처리
	}
	public void addList() {
		System.out.println("****** 마지막 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		
		Music m = new Music(title, singer);
		
		if(mc.addList(m) == 1) {
			System.out.println("추가 성공");
		}else{
			System.out.println("추가 실패");
		}
		
	}
	public void addAtZero() {
		System.out.println("****** 첫 위치에 곡 추가 ******");
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		
		Music m = new Music(title, singer);
		
		if(mc.addAtZero(m) == 1) {
			System.out.println("추가 성공");
		}else{
			System.out.println("추가 실패");
		}
	}
	public void printAll() {
		System.out.println("****** 전체 곡 목록 출력 ******");
		List<Music> ml = mc.printAll();
		int index = 0;
		for(int i = 0; i<ml.size(); i++) {
			Music m = ml.get(i);
			System.out.print(m);
			if(i == ml.size()-1) {
				System.out.println();
				break;
			}
			System.out.print(", ");
			
		}
	}
	public void searchMusic() {
		System.out.println("****** 특정 곡 검색 ******");
		System.out.print("검색할 곡 명 : ");
		String title = sc.nextLine();
		Music m = mc.searchMusic(title);
		if(m != null) {
			System.out.println(m);
		}else {
			System.out.println("검색한 곡이 없습니다.");
		}
		
	}
	public void removeMusic() {
		System.out.println("****** 특정 곡 삭제 ******");
		System.out.print("삭제할 곡 명 : ");
		String title = sc.nextLine();
		Music m = mc.removeMusic(title);
		if(m != null) {
			System.out.println(m+"을(를) 삭제하였습니다.");
		}else {
			System.out.println("삭제할 곡이 없습니다.");
		}
	}
	public void setMusic() {
		System.out.println("****** 특정 곡 정보 수정 ******");
		System.out.print("검색할 곡 명 : ");
		String title = sc.nextLine();
		System.out.print("수정할 곡 명 : ");
		String reTiele = sc.nextLine();
		System.out.print("수정할 가수 명 : ");
		String reSinger = sc.nextLine();
		
		Music m = mc.setMusic(title, new Music(reTiele, reSinger));
		if(m != null) {
			System.out.println(m+"의 값이 변경 되었습니다.");
		}else {
			System.out.println("수정할 곡이 없습니다.");
		}
	}
	public void ascTitle() {
		System.out.println("****** 곡 명 오름차순 정렬 ******");
		int num =mc.ascTitle();
		if(num != 1) {
			System.out.println("정렬 실패");
		}
		System.out.println("정렬 성공");
	}
	public void descSinger() {
		System.out.println("****** 곡 명 내림차순 정렬 ******");
		int num =mc.descSinger();
		if(num != 1) {
			System.out.println("정렬 실패");
		}
		System.out.println("정렬 성공");
	}
	
}
