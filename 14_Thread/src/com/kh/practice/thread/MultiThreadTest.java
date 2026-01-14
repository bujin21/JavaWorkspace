package com.kh.practice.thread;


public class MultiThreadTest {
	public static void main(String[] args) {
		Data data = new Data(); //공유데이터
		Thread putThread =new Thread(new Provider(data));
		Thread getThread =new Thread(new Customer(data));
		// data 를 공유하는 Provider 와 Customer 객체 생성 : Thread 객체 생성함
		// 쓰래드 구동
		putThread.start();
		getThread.start();
	}
}
