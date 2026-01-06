package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.*;

public class LibraryController {
	private Member mem = null; 
	private Book[] bList = new Book[5];
	
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	public Member myInfo() {
		return mem;
	}
	public Book[] selectAll() {
		return bList;
	}
	public Book[] searchBook(String keyword) {
		Book[] bl = new Book[5];
		int j = 0;
		for(int i =0; i<bList.length; i++) {
			String str = bList[i]+""; 
			if(str.contains(keyword)) {
				bl[j++] =  bList[i];
			}
			
		}
		return bl;
	}
	public int rentBook(int index) {
		int result = 0;
		int age;
		if(bList[index] instanceof AniBook) {
			age = ((AniBook)bList[index]).getAccessAge();
			result = age < mem.getAge() ? 0 : 1;
		}else if(bList[index] instanceof CookBook) {
			Boolean b = ((CookBook)bList[index]).isCoupon();
			if(b) mem.setCouponCount(mem.getCouponCount()+1);
			result = b ? 2 : 0;
		}
		return result;
	}
	
}
