package com.kh.example.practice5.model.vo;

public class Lotto {
	private int[] lotto;
	
	public Lotto() {}
	{
		lotto = new int[6];
		for(int i=0; i<lotto.length; i++) {
			for(int j=0; j<lotto.length; j++) {
				int random = (int)(Math.random() * 45 +1);
				if(lotto[j] == random) {
					i--;
				}else {
					lotto[j] = random;
				}
			}
		}
	}
	public void information() {
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+ " ");
		}
	}
}
