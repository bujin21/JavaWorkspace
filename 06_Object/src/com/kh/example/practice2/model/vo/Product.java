package com.kh.example.practice2.model.vo;

public class Product {
	private String Pname;
	private int price;
	private String brand;
	
	//기본생성자
	public Product() {
		
	}
	
	public void information() {
		System.out.println(Pname+", "+price+", "+brand);
	}
}
