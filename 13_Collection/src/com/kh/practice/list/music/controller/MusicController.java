package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList<>();
	
	public int addList(Music music) {
		try {
			// 마지막 리스트에 객체 저장, 1 리턴
			list.add(music);
			
			return 1;
		}catch(Exception e) {
			return 0;
		}
	}
	
	public int addAtZero(Music music) {
		try {
			list.add(0,music);
			return 1;
		} catch (Exception e) {
			return 0;
		}
	}
	
	public List<Music> printAll() {
		return list;
	}
	
	public Music searchMusic(String title) {
//		for(Music m : list) {
//			if(m.getTitle().equals(title)) {
//				return m;
//			}
//		}
//		return null;
		Music m = null;
		
		for(Object o : list ) {
			if(! (o instanceof Music)) {
				continue;
			}
			Music music = (Music) o;
			if(music.getTitle().equals(title)) {
				m = music;
				break;
			}
		}
		
		return m;
	}
	
	public Music removeMusic(String title) {
		// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 삭제, 없으면 null 리턴
		Music m = null;
		// 방법1
		for(int i=0; i<list.size(); i++ ) {
			Music music = (Music) list.get(i);
			if(music.getTitle().equals(title)) {
				// 삭제하려고하는 객체.
				m = music;
				list.remove(i);
			}
		}
		
		// 방법2.
//		Object o = searchMusic(title);
//		m = (Music) o;
//		list.remove(o);
		
		return m;
	}
	public Music setMusic(String title, Music music) {
		// 곡 명으로 객체 검색, 객체가 있으면 객체 정보 수정, 없으면 null 리턴 
		try {
			Music result = null; 
			int index = -1;
			
			for(int i =0; i<list.size(); i++) {
				Music m = (Music) list.get(i);
				
				if(m.getTitle().equals(title)) {
					index = i;
					result = m;
					break;
				}
			}
			
			list.set(index , music);
			return result;
		}catch(Exception e) {
			return null;
		}
	}
	public int ascTitle() {
		Collections.sort(list, new AscTitle());
		// 리스트 곡 명 오름차순 정렬, 제목이 같으면 가수 명으로 오름차순 정렬, 1 리턴
		return 1;
	}
	public int descSinger() {
		Collections.sort(list);
		return 1;
	}
}
