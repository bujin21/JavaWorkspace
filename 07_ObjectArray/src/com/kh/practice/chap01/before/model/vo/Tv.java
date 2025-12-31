package com.kh.practice.chap01.before.model.vo;

public class Tv {
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private int inch;
	
	public Tv() {
		
	}
	public Tv(String brand, String pCode, String pName,
			int price, int inch) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.inch = inch;
	}
	
}
