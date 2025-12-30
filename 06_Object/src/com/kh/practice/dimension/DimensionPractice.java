package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {
	Scanner sc = new Scanner(System.in);
	public void practice1(){
		String[][] arr = new String[3][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = "("+i+", "+j+")";
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	public void practice2(){
		int[][] arr = new int[4][4];
		int cnt =1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = cnt++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void practice3(){
		int[][] arr = new int[4][4];
		int cnt = 16;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = cnt--;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void practice4(){
		int[][] arr = new int[4][4];
        
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr[i].length-1; j++) {
				arr[i][j] = (int)(Math.random() *10 +1);
				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];
				arr[3][3] += arr[3][j];
				
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	public void practice5(){
		System.out.print("행 크기 : ");
		int row = sc.nextInt();
		System.out.print("열 크기 : ");
		int col = sc.nextInt();
		
		if(!(row > 0 && row<= 10 && col > 0 && col<= 10)) {
			System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			practice5();
			return;
		}
		
		char[][]arr = new char[row][col];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (char)((int)(Math.random() * 26 + 65));
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public void practice6(){
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, 
											{"차", "지", "습", "으", "냅"}, 
											{"원","열", "니", "로", "시"}, 
											{"배", "심", "다", "좀", "다"}, 
											{"열", "히", "! ", "더", "!! "}};
		
		for(int i=0; i<strArr.length; i++) {
			for(int j=0; j<strArr[i].length; j++) {
				System.out.print(strArr[j][i]+ " ");
			}
		}
	}
	public void practice7(){
		System.out.print("행의 크기 : ");
		int hangSize = sc.nextInt();
		char ch = 'a';
		char[][] chs = new char[hangSize][]; 
		for(int i=0; i<hangSize; i++) {
			System.out.print(i+"행의 열 크기 : ");
			int n = sc.nextInt();
			chs[i] = new char[n];
		}
		
		for(int i=0; i<chs.length; i++) {
			for(int j=0; j<chs[i].length; j++) {
				chs[i][j] = ch++;
				
				System.out.print(chs[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	public void practice8(){
		String [] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		// 2분단 (각각 2열 3행)
	    String[][] group1 = new String[3][2];
	    String[][] group2 = new String[3][2];
	    int index = 0;
		
	 // 1분단 채우기
	    for (int i = 0; i < 2; i++) {
	        for (int j = 0; j < 3; j++) {
	            group1[j][i] = students[index++];
	        }
	    }

	    // 2분단 채우기
	    for (int i = 0; i < 2; i++) {
	        for (int j = 0; j < 3; j++) {
	            group2[j][i] = students[index++];
	        }
	    }

	    // 출력
	    System.out.println("== 1분단 ==");
	    for (int i = 0; i < 3; i++) {
	        for (int j = 0; j < 2; j++) {
	            System.out.print(group1[i][j] + "\t");
	        }
	        System.out.println();
	    }

	    System.out.println("== 2분단 ==");
	    for (int i = 0; i < 3; i++) {
	        for (int j = 0; j < 2; j++) {
	            System.out.print(group2[i][j] + "\t");
	        }
	        System.out.println();
	    }
		
	}
	
	public void practice9(){
		// 출석부
	    String[] students = {
	        "강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
	        "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"
	    };

	    // 분단 배열 (3행 2열)
	    String[][] group1 = new String[3][2];
	    String[][] group2 = new String[3][2];

	    int idx = 0;

	    // 1분단 배치 (왼→오, 위→아래)
	    for (int col = 0; col < 2; col++) {
	        for (int row = 0; row < 3; row++) {
	            group1[row][col] = students[idx++];
	        }
	    }

	    // 2분단 배치
	    for (int col = 0; col < 2; col++) {
	        for (int row = 0; row < 3; row++) {
	            group2[row][col] = students[idx++];
	        }
	    }

	    // 자리 출력
	    System.out.println("== 1분단 ==");
	    for (int i = 0; i < 3; i++) {
	        for (int j = 0; j < 2; j++) {
	            System.out.print(group1[i][j] + "\t");
	        }
	        System.out.println();
	    }

	    System.out.println("== 2분단 ==");
	    for (int i = 0; i < 3; i++) {
	        for (int j = 0; j < 2; j++) {
	            System.out.print(group2[i][j] + "\t");
	        }
	        System.out.println();
	    }

	    System.out.println("==============================");
	    System.out.print("검색할 학생 이름을 입력하세요 : ");
	    String name = sc.next();

	    // 검색
	    boolean found = false;

	    // 1분단 검색
	    for (int i = 0; i < 3; i++) {
	        for (int j = 0; j < 2; j++) {
	            if (group1[i][j].equals(name)) {
	                System.out.println(
	                    "검색하신 " + name + " 학생은 1분단 " +
	                    (i + 1) + "번째 줄 " +
	                    (j == 0 ? "왼쪽" : "오른쪽") + "에 있습니다."
	                );
	                found = true;
	            }
	        }
	    }

	    // 2분단 검색
	    for (int i = 0; i < 3 && !found; i++) {
	        for (int j = 0; j < 2; j++) {
	            if (group2[i][j].equals(name)) {
	                System.out.println(
	                    "검색하신 " + name + " 학생은 2분단 " +
	                    (i + 1) + "번째 줄 " +
	                    (j == 0 ? "왼쪽" : "오른쪽") + "에 있습니다."
	                );
	                found = true;
	            }
	        }
	    }
	    
	}
}
