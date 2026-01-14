package com.kh.practice.thread;

public class Customer extends Thread{
	private Data data;
	
	public Customer(Data data) {
		this.data = data;
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			try {
				if(data.getValue() == 0) {
					String str = null ;					
				}
			} catch (EmptyException e) {
				e.printStackTrace();
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
