package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController extends Member{
	private Member[] m = new Member[SIZE];
	public static int SIZE=10;
	Boolean isValue = false;
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
		for(int i=0; i<SIZE; i++) {
			if(m[i].getId().equals(inputId)) {
				isValue=true;
			}
		}
		return isValue;
	}
	
	public void insertMember(String id, String name, String password, String email, String gender, int age) {
		for(int i=0; i<SIZE; i++) {
			if(m[i]==null) {
				m[i].setId(id);
				m[i].setName(name);
				m[i].setPassword(password);
				m[i].setEmail(email);
				m[i].setGender(gender.charAt(0));
				m[i].setAge(age);
				
				break;
			}
		}
	}
	
	public String searchId(String id) {
		Member[] member = new Member[SIZE];
		String str ="";
		int j = 0;
		for(int i=0; i<m.length; i++) {
			if(m[i].getEmail().equals(id)) {
				member[j].setId(m[i].getId());
				member[j].setName(m[i].getName());
				member[j].setPassword(m[i].getPassword());
				member[j].setEmail(m[i].getEmail());
				member[j].setGender(m[i].getGender());
				member[j].setAge(m[i].getAge());
				j++;
			}
		}
		
		return str;
	}
	
	public Member[] searchName(String name) {
		Member[] member = new Member[SIZE];
		int j = 0;
		for(int i=0; i<m.length; i++) {
			if(m[i].getEmail().equals(name)) {
				member[j].setId(m[i].getId());
				member[j].setName(m[i].getName());
				member[j].setPassword(m[i].getPassword());
				member[j].setEmail(m[i].getEmail());
				member[j].setGender(m[i].getGender());
				member[j].setAge(m[i].getAge());
				j++;
			}
		}
		
		return member;
	}
	
	public Member[] searchEmail(String email) {
		Member[] member = new Member[SIZE];
		int j = 0;
		for(int i=0; i<m.length; i++) {
			if(m[i].getEmail().equals(email)) {
				member[j].setId(m[i].getId());
				member[j].setName(m[i].getName());
				member[j].setPassword(m[i].getPassword());
				member[j].setEmail(m[i].getEmail());
				member[j].setGender(m[i].getGender());
				member[j].setAge(m[i].getAge());
				j++;
			}
		}
		
		return member;
	}
	public Boolean updatePassword(String id, String password) {
		for(Member m : m) {
			if(m.getId().equals(id)) {
				m.setPassword(password);
				isValue = true;
			}else {
				isValue = false;
			}
		}
		return isValue;
	}
	
	public Boolean updateName(String id, String name) {
		for(Member m : m) {
			if(m.getId().equals(id)) {
				m.setName(name);
				isValue = true;
			}else {
				isValue = false;
			}
		}
		return isValue;
	}
	
	public Boolean updateEmail(String id, String email) {
		for(Member m : m) {
			if(m.getId().equals(id)) {
				m.setEmail(email);
				isValue = true;
			}else {
				isValue = false;
			}
		}
		return isValue;
	}
	
	public Boolean delete(String id) {
		for(int i=0; i<m.length; i++) {
			if(m[i].getId().equals(id)) {
				m[i] = null;
				isValue = true;
			}else {
				isValue = false;
			}
		}
		return isValue;
	}
	
	public void delete() {
		m = new Member[SIZE];
	}
}
