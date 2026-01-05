package com.kh.hw.member.controller;

import java.util.Arrays;

import com.kh.hw.member.model.vo.Member;

public class MemberController extends Member{
	private Member[] m = new Member[SIZE]; //[new Member(), nullm null,null,..]
	public final static int SIZE=10;
	
	
	public MemberController() {}
	
	public int existMemberNum() {
		int cnt =  0;
		for(Member mem : m) {
			if(mem != null) {
				cnt++;
			}
		}
		return cnt;
	}
	
	public Boolean checkid(String inputId) {
		Boolean isValue = false;
		for(Member mem : m) {
			if(mem != null && inputId.equals(mem.getId())) {
				isValue=true;
				break;
			}
		}
		return isValue;
	}
	
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		//전달받은 데이터로 객체 생성.
		Member mem = new Member(id, name, password, email, gender, age);
		
		// 생성한 객체를 객체배열상 비어있는부분(null값인)에 저장
		for(int i =0; i<m.length; i++) {
			if(m[i] == null) { // 빈공간
				m[i] = mem;
				break;
			}
		}		
	}
	
	public String searchId(String id) {
		String str ="";
		for(Member mem : m) {
			if(id.equals(mem.getId())) {
				str = mem.inform();
			}
		}
		
		return str;
	}
	
	public Member[] searchName(String name) {
		Member[] member = new Member[SIZE];
		int index = 0;
		for(Member mem : this.m) {
			if(mem != null && mem.getName().equals(name)) {
				member[index++] = mem;
			}
		}
		// 찾고자 하는 회원이 한명도 없는 경우
		if(index == 0) {
			return null;
		}else {
			Member[] copy = Arrays.copyOf(m, index);
			return copy;
		}
	}
	
	public Member[] searchEmail(String email) {
		Member[] member = new Member[SIZE];
		int index = 0;
		for(Member mem : this.m) {
			if(mem != null && mem.getEmail().equals(email)) {
				member[index++] = mem;
			}
		}
		// 찾고자 하는 회원이 한명도 없는 경우
		if(index == 0) {
			return null;
		}else {
			Member[] copy = Arrays.copyOf(m, index);
			return copy;
		}
	}
	public Boolean updatePassword(String id, String password) {
		Boolean result = false;
		for(Member mem : m) {
			if(mem != null && mem.getId().equals(id)) {
				mem.setPassword(password);
				result = true;
			}else {
				result = false;
			}
		}
		return result;
	}
	
	public Boolean updateName(String id, String name) {
		Boolean result = false;
		for(Member mem : m) {
			if(mem != null && mem.getId().equals(id)) {
				mem.setName(name);
				result = true;
			}else {
				result = false;
			}
		}
		return result;
	}
	
	public Boolean updateEmail(String id, String email) {
		Boolean result = false;
		for(Member mem : m) {
			if(mem != null && mem.getId().equals(id)) {
				mem.setEmail(email);
				result = true;
			}else {
				result = false;
			}
		}
		return result;
	}
	
	public Boolean delete(String id) {
		Boolean result = false;
		for(int i=0; i<m.length; i++) {
			if(m[i] != null && id.equals(m[i].getId())) {
				m[i] = null; //삭제처리
				result = true; // 삭제완료
			}
			
		}
		return result;
	}
	
	public void delete() {
		//전체 회원을 삭제하는 메서드
		m = new Member[SIZE];
	}

	public Member[] printAll() {
		
		return m;
	}
}
