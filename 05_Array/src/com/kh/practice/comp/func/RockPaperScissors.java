package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {
	Scanner sc = new Scanner(System.in);

    public void rps() {
        String[] rps = {"가위", "바위", "보"};

        System.out.print("당신의 이름을 입력해주세요. : ");
        String name = sc.next();

        int win = 0, draw = 0, lose = 0, total = 0;

        while (true) {
            System.out.print("가위바위보 : ");
            String input = sc.next();

            if (input.equals("exit")) {
                System.out.println(total + "전 " + win + "승 " + draw + "무 " + lose + "패");
                break;
            }

            int player = -1;
            for (int i = 0; i < 3; i++) {
                if (rps[i].equals(input)) {
                    player = i;
                    break;
                }
            }

            if (player == -1) {
                System.out.println("잘못 입력하셨습니다.");
                continue;
            }

            int com = (int)(Math.random() * 3);
            total++;

            System.out.println("컴퓨터 : " + rps[com]);
            System.out.println(name + " : " + rps[player]);

            int result = (player - com + 3) % 3;

            if (result == 0) {
                draw++;
                System.out.println("비겼습니다.");
            } else if (result == 1) {
                win++;
                System.out.println("이겼습니다.");
            } else {
                lose++;
                System.out.println("졌습니다.");
            }
        }
    }
}
