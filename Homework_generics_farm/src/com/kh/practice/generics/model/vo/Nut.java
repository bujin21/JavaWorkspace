package com.kh.practice.generics.model.vo;

public class Nut extends Farm{
	private String name;

	public Nut() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Nut(String kind, String name) {
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
		return "Nut [name=" + name + "]";
	}
	
	
	
}
