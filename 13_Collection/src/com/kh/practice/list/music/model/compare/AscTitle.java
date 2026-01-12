package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;



public class AscTitle implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		
		Music m1 = (Music) o1;
		Music m2 = (Music) o2;
		// 리스트 곡 명 오름차순 정렬, 제목이 같으면 가수 명으로 오름차순 정렬, 1 리턴
		int result = m1.getTitle().compareTo(m2.getTitle());
		
		if(result == 0) {
			result = m1.getSinger().compareTo(m2.getSinger());
		}
		
		return result;		
	}

}
