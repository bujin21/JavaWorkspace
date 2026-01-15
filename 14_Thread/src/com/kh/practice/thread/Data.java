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
					e.printStackTrace();
				}
			}
			isEmpty = false;
			System.out.println("값이 입력되었습니다.");
			System.out.println("put value : "+value);
			this.value = value;
			
			notify(); 
		}
	}
	public int getValue() {
		synchronized (this) {
			if(isEmpty) {
				try {
					// 다른 스레드가 깨우기 전까지 대기상태로 전환.
					throw new EmptyException("현재 입력된 값이 없습니다. 기다리십시오..");
				} catch (Exception e) {
					String erroMessage = e.getMessage();
					System.out.println(erroMessage);
					try {
						wait(); //값이 찰때까지 대기
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					} 
				}
			
			}
			isEmpty = true;
			System.out.println("get value : "+ value);
			System.out.println("값을 꺼냈습니다. value가 비었습니다.");
			notify();
		}
		return value;
	}
}
