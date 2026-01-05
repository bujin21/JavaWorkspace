package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberMenu() {
		
	}
	
	public void mainMenu() {
		int memberNum = mc.existMemberNum();
		System.out.println("최대 등록 가능한 회원 수는 "+MemberController.SIZE+"명입니다."); 
		System.out.println("현재 등록된 회원 수는 "+memberNum+"명입니다."); 
		// MemberController(mc)클래스 안에 있는 멤버필드를 이용하여
		// 최대 등록 가능한 회원 수가 몇 명인지 출력
		// 또한 현재 등록된 회원 수는 mc에 existMemberNum()의 반환 값으로
		// 몇 명이 등록되어 있는지 출력
		
		// 현재 등록된 회원 수에 따라 메인 메뉴를 다르게 출력
		// 현재 등록된 회원 수가 10명이 아닐 때
		/*
		1. 새 회원 등록 ➔ insertMember()
		2. 회원 검색 ➔ searchMember()
		3. 회원 정보 수정 ➔ updateMember()
		4. 회원 삭제 ➔ deleteMember()
		5. 모두 출력 ➔ printAll()
		9. 끝내기
		메뉴 번호 :
		*/
		while(true) {
			if(memberNum != MemberController.SIZE) {
				System.out.println("1. 새 회원 등록");
				
			}else {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			}
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 :");
			int menuNum = sc.nextInt();
			switch(menuNum) {
			case 1 :
				if(memberNum != MemberController.SIZE /*mc.SIZE로 해도되지만 static한 방식으로 대려와야 하기 때문에, 나중에 문제나지 않기 위해*/) {
					insertMember();
					break;
				}else {
					System.out.println("잘못 입력하셨습니다.");
					break;
				}
			case 2 :
				searchMember();
				break;
			case 3 :
				updateMember();
				break;
			case 4 :
				deleteMember();
				break;
			case 5 :
				printAll();
				break;
			case 9 :
				 System.out.println("프로그램을 종료합니다");
				 return;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				break;
			}
			
		}
		
	}
	public void insertMember() {
		// 회원 등록에 필요한 아이디, 이름, 비밀번호, 이메일, 성별, 나이를
		// 사용자에게 직접 입력 받되 아이디의 경우 기존 회원의 아이디와
		// 중복되지 않도록 mc의 checkId()메소드를 통해서 중복 검사를 함
		// 중복 검사를 한 결과 값에 따라 중복 값이 없으면 다음으로 넘어가고
		// 있으면 “중복된 아이디입니다. 다시 입력해주세요.”라는 문구를 출력 후
		// 다시 아이디를 받도록 함
		// 성별의 경우 M이나 m, F나 f가 아니면 “성별을 다시 입력하세요.”를
		// 출력 후 다시 성별을 입력하도록 함
		// 아이디부터 나이까지 모든 데이터를 받았으면
		// mc의 insertMember메소드의 매개변수로 넘김
		System.out.println("새 회원을 등록합니다.");
		
		System.out.print("아이디 : ");
		String id = sc.next();
		boolean isDup = mc.checkid(id);
		
		if(isDup) { //중복인 경우
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			insertMember();
			return;
		}

		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("비밀번호 : ");
		String pwd = sc.next();
		
		System.out.print("이메일 : ");
		String email = sc.next();
		
		char gender = '\u0000';
		while(true) {
			System.out.print("성별(M/F) : ");
			gender = sc.next().toUpperCase().charAt(0);
			if(gender == 'm' || gender == 'M' || gender == 'f' || gender == 'F') {
				break;
			}
				System.out.println("성별을 다시 입력하세요.");
				
		}
		
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		mc.insertMember(id, name, pwd, email, gender, age);
		
		
	}
	
	public void searchMember() {
		/*
		1. 아이디로 검색하기 ➔ searchId()
		2. 이름으로 검색하기 ➔ searchName()
		3. 이메일로 검색하기 ➔ searchEmail()
		9. 메인으로 돌아가기
		메뉴 번호 :
		*/
		// 메뉴 번호에 따라 각 메소드로 이동되며 9번을 입력했을 경우
		// “메인으로 돌아갑니다.” 출력 후 mainMenu()로 돌아감
		// 메뉴 번호를 잘못 입력했을 경우 “잘못 입력하셨습니다.” 출력 후
		// mainMenu()로 돌아감
		
		while(true) {
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1:
				searchId();
				break;
			case 2:
				searchName();
				break;
			case 3:
				searchEmail();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				mainMenu();
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}
	public void searchId() {
		// 검색할 아이디를 사용자에게 입력 받고 입력 받은 데이터를
		// mc의 searchId() 메소드의 매개변수로 넘김, 반환 값에 따라
		// 검색 결과 없으면 “검색 결과가 없습니다.” 출력 후 mainMenu()로 돌아감
		// 검색 결과가 있으면 “찾으신 회원 조회 결과입니다.” 출력 후
		// 회원 검색 결과 출력
		System.out.print("검색할 아이디 : ");
		String id = sc.next();
		String result = mc.searchId(id);
		
		if(result != null) {
			System.out.println("찾으신 회원 검색 결과입니다.");
			System.out.println(result);
		}else {
			System.out.println("검색 결과가 없습니다.");
		}
		
		
	}
	
	public void searchName() {
		// 검색할 이름을 사용자에게 입력 받고 입력 받은 데이터를
		// mc의 searchName() 메소드의 매개변수로 넘김, 반환 값에 따라
		// 검색 결과 없으면 “검색 결과가 없습니다.” 출력 후 mainMenu()로 돌아감
		// 검색 결과가 있으면 “찾으신 회원 조회 결과입니다.” 출력 후
		// 회원 검색 결과 출력
		System.out.print("검색할 이름 : ");
		String name = sc.next();
		System.out.println("찾으신 회원 검색 결과입니다.");
		Member[] result = new Member[mc.searchName(name).length];
		if(result != null) {
			System.out.println("찾으신 회원 검색 결과입니다.");
			for(Member m : result) {
				System.out.println(m);
			}
			
		}else {
			System.out.println("검색 결과가 없습니다.");
		}
		
		
	}
	public void searchEmail() {
		// 검색할 아이디를 사용자에게 입력 받고 입력 받은 데이터를
		// mc의 searchEmail() 메소드의 매개변수로 넘김, 반환 값에 따라
		// 검색 결과 없으면 “검색 결과가 없습니다.” 출력 후 mainMenu()로 돌아감
		// 검색 결과가 있으면 “찾으신 회원 조회 결과입니다.” 출력 후
		// 회원 검색 결과 출력
		System.out.print("검색할 이메일 : ");
		String email = sc.next();
		System.out.println("찾으신 회원 검색 결과입니다.");
		Member[] result = new Member[mc.searchEmail(email).length];
		if(result != null) {
			System.out.println("찾으신 회원 검색 결과입니다.");
			for(Member m : result) {
				System.out.println(m);
			}
			
		}else {
			System.out.println("검색 결과가 없습니다.");
		}
	}
	
	public void updateMember() {
		/*
		1. 비밀번호 수정하기 ➔ updatePassword()
		2. 이름 수정하기 ➔ updateName()
		3. 이메일 수정하기 ➔ updateEmail()
		9. 메인으로 돌아기기
		*/
		// 메뉴 번호에 따라 각 메소드로 이동되며 9번을 입력했을 경우
		// “메인으로 돌아갑니다.” 출력 후 mainMenu()로 돌아감
		// 메뉴 번호를 잘못 입력했을 경우 “잘못 입력하셨습니다.” 출력 후
		// mainMenu()로 돌아감
		
		while(true) {
			System.out.println("1. 비밀번호 수정하기");
			System.out.println("2. 이름 수정하기");
			System.out.println("3. 이메일 수정하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1:
				updatePassword();
				break;
			case 2:
				updateName();
				break;
			case 3:
				updateEmail();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				mainMenu();
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
			break;
		}
	}
	public void updatePassword() {
		// 수정할 회원 id와 비밀번호를 사용자에게 입력 받고 입력 받은 데이터를
		// mc의 updatePassword() 메소드의 매개변수로 넘김, 반환 값에 따라
		// 검색결과 없으면 “존재하지 않는 아이디입니다.” 출력, mainMenu()로 감
		// 검색 결과가 있으면 “수정이 성공적으로 되었습니다.” 출력 후
		// mainMenu()로 돌아감
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.next();
		System.out.print("수정할 비밀번호 : ");
		String password = sc.next();
		
		boolean result = mc.updatePassword(id, password);
		if(result) {
			System.out.println("수정이 성공적으로 되었습니다.");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		
		
	}
	public void updateName() {
		// 수정할 회원 id와 이름을 사용자에게 입력 받고 입력 받은 데이터를
		// mc의 updateName() 메소드의 매개변수로 넘김, 반환 값에 따라
		// 검색결과 없으면 “존재하지 않는 아이디입니다.” 출력, mainMenu()로 감
		// 검색 결과가 있으면 “수정이 성공적으로 되었습니다.” 출력 후
		// mainMenu()로 돌아감
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.next();
		System.out.print("수정할 이름 : ");
		String name = sc.next();
		
		boolean check = mc.updateName(id, name);
		if(check) {
			System.out.println("수정이 성공적으로 되었습니다.");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	public void updateEmail() {
		// 수정할 회원 id와 이메일을 사용자에게 입력 받고 입력 받은 데이터를
		// mc의 updateEmail() 메소드의 매개변수로 넘김, 반환 값에 따라
		// 검색결과 없으면 “존재하지 않는 아이디입니다.” 출력, mainMenu()로 감
		// 검색 결과가 있으면 “수정이 성공적으로 되었습니다.” 출력 후
		// mainMenu()로 돌아감
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.next();
		System.out.print("수정할 이메일 : ");
		String email = sc.next();
		
		boolean check = mc.updateEmail(id, email);
		if(check) {
			System.out.println("수정이 성공적으로 되었습니다.");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	public void deleteMember() {
		/*
		1. 특정 회원 삭제하기 ➔ deleteOne()
		2. 모든 회원 삭제하기 ➔ deleteAll()
		9. 메인으로 돌아기기
		*/
		// 메뉴 번호에 따라 각 메소드로 이동되며 9번을 입력했을 경우
		// “메인으로 돌아갑니다.” 출력 후 mainMenu()로 돌아감
		// 메뉴 번호를 잘못 입력했을 경우 “잘못 입력하셨습니다.” 출력 후
		// mainMenu()로 돌아감
		
		while(true) {
			System.out.println("1. 특정 회원 삭제하기");
			System.out.println("2. 모든 회원 삭제하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1:
				deleteOne();
				break;
			case 2:
				deleteAll();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				mainMenu();
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}
	public void deleteOne() {
		// 삭제할 회원 id를 사용자에게 입력 받고 정말 삭제할 것인지 사용자에게
		// 물어본 뒤, Y나 y를 사용자가 입력할 경우 입력 받은 id를
		// mc의 delete() 메소드의 매개변수로 넘김, 반환 값에 따라
		// 검색결과 없으면 “존재하지 않는 아이디입니다.” 출력, mainMenu()로 감
		// 검색 결과가 있으면 “성공적으로 삭제하였습니다.” 출력 후
		// mainMenu()로 돌아감
		System.out.print("삭제할 회원의 아이디 : ");
		String id = sc.next();
		
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		char ch = sc.next().toUpperCase().charAt(0);
		
		if(ch != 'Y') {
			System.out.println("메인으로 돌아갑니다.");
			return;
		}
		boolean result = mc.delete(id);
		if(result) {
			System.out.println("성공적으로 삭제하였습니다.");
		}else {
			System.out.println("존재하지 않는 아이디 입니다.");
		}
		
	}
	public void deleteAll() {
		// 정말 삭제할 것인지 사용자에게 물어본 뒤, Y나 y를 사용자가 입력할 경우
		// mc의 delete() 메소드 호출, “성공적으로 삭제하였습니다.” 출력 후
		// mainMenu()로 돌아감
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		char ch = sc.next().toUpperCase().charAt(0);
		
		if(ch != 'Y') {
			System.out.println("메인으로 돌아갑니다.");
			return;
		} 
		mc.delete();
		System.out.println("성공적으로 삭제하였습니다.");
		
	}
	public void printAll() {
		// mc의 printAll() 메소드의 반환 값을 가지고 저장된 회원을 출력하는데
		// 저장된 회원의 수가 0명이면 “저장된 회원이 없습니다.” 출력,
		// 0명이 아니면 저장된 모든 회원의 정보 출력
		Member[] m =mc.printAll();
		int memberNum = mc.existMemberNum();
		
		if(memberNum == 0) {
			System.out.println("저장된 회원이 없습니다.");
			return;
		}
		
		for(Member mem : m) {
			if(mem != null)
			System.out.println(mem);
		}
	}
}
