package com.kh.practice.leap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	
	public LeapView() {
		Calendar cal = new GregorianCalendar();
		int nowYear = cal.get(Calendar.YEAR);
		LeapController lc = new LeapController();
		System.out.println(nowYear+"년은 "+ lc.isLeapYear(nowYear) != null ? "윤년입니다." : "평년입니다.");
		System.out.println("총 날짜 수 : "+ lc.leapDate(cal));
	}
}
