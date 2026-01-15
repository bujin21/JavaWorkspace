package com.kh.practice.generics.model.vo;

public class Vegetable extends Farm{
	private String name;

	public Vegetable() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Vegetable(String kind, String name) {
		super(kind);
		this.name = name;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return super.getKind()+": "+name;
	}
	
	
}
