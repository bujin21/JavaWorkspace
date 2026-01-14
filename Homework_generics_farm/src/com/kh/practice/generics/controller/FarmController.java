package com.kh.practice.generics.controller;

import java.util.ArrayList;
import java.util.HashMap;

import com.kh.practice.generics.model.vo.Farm;

public class FarmController {
	private HashMap<Farm, Integer> hMap = new HashMap<>();
	private ArrayList<Farm> list = new ArrayList<>();
	
	public boolean addNewKind(Farm f, int amount) {
		return false;
	}
	public boolean removeKind(Farm f) {
		return false;
	}
	
	public boolean changeAmount(Farm f, int amount) {
		return false;
	}
	public HashMap<Farm, Integer> printFarm(){
		return hMap;
	}
	public boolean buyFarm(Farm f) {
		return false;
	}
	public boolean removeFarm(Farm f) {
		return false;
	}
	public ArrayList<Farm> printBuyFarm(){
		return list;
	}
}
