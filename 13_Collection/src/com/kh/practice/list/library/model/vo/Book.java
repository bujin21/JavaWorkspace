package com.kh.practice.list.library.model.vo;

import java.util.Objects;

public class Book implements Comparable<Book>{
	private String title;
	private String author;
	private String category;
	private int price;
	
	public Book() {
	
	}

	public Book(String title, String author, String category, int price) {
		super();
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "("+title+"/"+author+"/"+category+"/"+price+")";
	}

	@Override
	public int compareTo(Book o) {
		return this.title.compareTo(o.title);

	}

//	@Override
//	public int hashCode() {
//		// 전통적인 hashCode 생성방식
//		final int prime = 31;
//		int result = 1;
//		result = prime * result +price;
//		result = prime * result +(title == null ? 0 : title.hashCode());
//		result = prime * result +(author == null ? 0 : author.hashCode());
//		result = prime * result +(category == null ? 0 : category.hashCode());
	
//
//	@Override
//	public boolean equals(Object obj) {
//		if(!(obj instanceof Book)) {
//			return false;
//		}
//		Book b = (Book)obj;
//		if(this.title.equals(b.title) && this.author.equals(b.author)
//					&& this.category.equals(b.category)
//					&& this.price == b.price) {
//			return true;
//		}
	@Override
	public int hashCode() {
		return Objects.hash(author, category, price, title);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) // instanceof
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(category, other.category) && price == other.price
				&& Objects.equals(title, other.title);
	}
	
	
}
