package com.kh.practice.thread;

public class Data {
	private int value;
	private boolean isEmpty =true;
	
	public Data() {
		
	}
	public void setValue(int value) {
		synchronized (this) {
			if(isEmpty == false) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			this.value = value;
			isEmpty = false;
			System.out.println("값이 입력되었습니다.");
			System.out.println("put value : "+value);
			
			notify(); // 컴슈머가 대기중인경우 깨우는 메서드
		}
	}
	public int getValue() {
		synchronized (this) {
			if(isEmpty) {
				try {
					// 다른 스레드가 깨우기 전까지 대기상태로 전환.
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("get value : "+this.value);
			this.value = 0;
			isEmpty = true;
			System.out.println("값을 꺼냈습니다. value 가 비었습니다");
			notify();
		}
		return value;
	}
}
