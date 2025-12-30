package com.kh.example.practice6.model.vo;

public class Book {
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discoountRate;
	
	public Book() {}
	
	public Book(String title,String publisher,String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	public Book(String title,String publisher,String author, int price, double discountRate) {
		this(title, publisher, author);
		this.price = price;
		this.discoountRate = discountRate;
	}
	
	public void inform() {
		System.out.println(title+", "+publisher+ ", "+author+", "+price+", "+discoountRate);
	}
}
