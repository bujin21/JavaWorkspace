package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;



public class AscTitle implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		
		return ((Music) o2).getTitle().compareTo(((Music) o1).getTitle());
	}

	

	
	
}
