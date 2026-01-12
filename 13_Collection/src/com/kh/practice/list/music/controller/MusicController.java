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
		list.add(music);
		return 1;
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
		for(Music m : list) {
			if(m.getTitle().equals(title)) {
				return m;
			}
		}
		return null;
	}
	
	public Music removeMusic(String title) {
		Music m = searchMusic(title);
//		Object o =searchMusic(title);
		int num = list.indexOf(m);
		list.remove(num);
//		list.remove(o);
		if(m != null) {
			return m;
		}
		return null;
	}
	public Music setMusic(String title, Music music) {
		Music m = searchMusic(title);
		if(m != null) {
			int index = list.indexOf(m);
			list.set(index, music);
			return list.get(index);
		}
		return null;
	}
	public int ascTitle() {
		Collections.sort(list, new AscTitle());
		// 리스트 곡 명 오름차순 정렬, 
		return 1;
	}
	public int descSinger() {
		Comparator<Object> comp = new AscTitle();
		Collections.sort(list, comp);
		return 1;
	}
}
