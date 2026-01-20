package com.kh.chap02_enum.model._enum;

import java.util.Arrays;

public enum CarColor {
	//public static final Color BLACk = new Color(0, "black");
	/*
	 * Enum - > Enumeration(열거) / 클래스 내부의 상수값들을  
	 * 		열거하였기 때문에 enum이라는 명칭을 쓴다.
	 * 		객체단위 상수값들을 간결하게 다루기 위해 고안되었다.
	 */
	BLACK(0, "black"){
		@Override
		public void printTest() {
			System.out.println("빨간색입니다.");
		}
	},
	WHITE(1, "white"){
		@Override
		public void printTest() {
			System.out.println("빨간색입니다.");
		}
	},
	RED(2, "red"){
		@Override
		public void printTest() {
			System.out.println("빨간색입니다.");
		}
	};
	 
	private int color;
	private String name;
	
	private CarColor(int color, String name) {
		this.color = color;
		this.name = name;
	}

	public int getColor() {
		return color;
	}
	
	// enum만의 기능
	// 	- enum내부의 상수값들을 배열로 모아서 반환해주는 메서그
	//	 values()
	public static CarColor valueOf(int color) {
		return Arrays
			.stream(values())
			.filter( _enum -> _enum.color == color)
			.findFirst()
			.orElseThrow(() -> new RuntimeException("일치하는 컬러가 없습니다."));

	}
	public abstract void printTest();
}
