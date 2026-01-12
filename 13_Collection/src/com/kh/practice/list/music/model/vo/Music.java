package com.kh.practice.list.music.model.vo;

public class Music implements Comparable<Object>{
	private String title;
	private String singer;
	
	public Music() {
	
	}

	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return singer + " - " + title;
	}
	public boolean equals(Object obj) {
		Music m = (Music)obj;
		boolean b = this.getTitle() == m.getTitle();
		return b;
	}
	public int compareTo(Object o) {
		Music m = (Music)o;
		return this.title.compareTo(m.title);
	}

	

	
	
	
}
