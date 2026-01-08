package com.kh.practice.leap.controller;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapController {
	public boolean isLeapYear(int year) {
		boolean check = false;
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			
			check = true;
		} else {
			
			check = false;
		}


		return check;
	}
	public long leapDate(Calendar c) {
		
		int nowYear = c.get(Calendar.YEAR);
		long cntDay = 0;
		for(int year=1; year<nowYear; year++) {
			if(isLeapYear(year)) {
				cntDay += 366;
			}else {
				cntDay += 365;
			}
		}
		int month = c.get(Calendar.MONTH);
		for(int mon=0; mon<month; mon++){
			switch(mon) {
			case 1,3,5,7,8,10,12:
				cntDay += 31;
				break;
			case 2:
				if(isLeapYear(nowYear)) {
					cntDay += 29;
					break;
				}else {
					cntDay += 28;
					break;
				}
				
			case 4,6,9,11:
				cntDay +=30;
				break;
			}
		}
		cntDay += c.get(Calendar.DATE);
		return cntDay;
	}
}
