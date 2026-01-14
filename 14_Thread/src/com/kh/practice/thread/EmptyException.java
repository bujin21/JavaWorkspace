package com.kh.practice.thread;

public class EmptyException extends RuntimeException{
	public EmptyException() {}
	public EmptyException(String message) {
		super("현재 입력된 값이 없습니다. 기다리십시오…");
	}
}
