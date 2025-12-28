package com.kh.practice.comp.func;

import java.util.Scanner;

public class UpAndDown {
	Scanner sc = new Scanner(System.in);
	public void upDown(){
		//1부터 100 사이의 정수 중 임의의 난수가 정해지고 사용자는 정해진 난수를 맞추는데
		//몇 번 만에 맞췄는지 출력하세요.
		
		int random  = (int)(Math.random() * 100 + 1);
		int cnt = 0;
		while(true) {
			System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
			int num = sc.nextInt();
			if(num <100 && num > 0 ) {
				cnt++;
				if(random > num) {
					System.out.println("UP !");
				}else if(random == num){
					System.out.println("정답입니다 !!");
					System.out.println(cnt+"회만에 맞추셨습니다.");
					break;
				}
				else {
					System.out.println("\nDOWN !");
				}
			}else {
				System.out.println("1~100 사이의 숫자를 입력해주세요.");
				continue;
			}

		}//while
	}
}
