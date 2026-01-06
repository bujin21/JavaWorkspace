package practice3.controller;

import practice3.model.vo.*;

public class AnimalManager {
	public static void main(String[] args) {
		Animal[] a = new Animal[5];
		a[0] = new Dog("누렁이", "진돗개", 5);
		a[1] = new Cat("나비", "고양이", "부천", "하얀색");
		a[2] = new Cat("오레오", "코리안숏헤어", "목동", "흰색,검은색");
		a[3] = new Dog("엘리자베스", "웰시코기", 3);
		a[4] = new Cat("치즈", "치즈태비", "능곡", "노란색");
		
		for(Animal ani : a) {
			ani.speak();
		}
	}
}
