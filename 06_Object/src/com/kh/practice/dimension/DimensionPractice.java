package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {
	Scanner sc = new Scanner(System.in);
	public void practice1(){
		int[][] arr = new int[3][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = j;
				System.out.print("("+i+", "+j+")");
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
		int first =0; 
		int second =0; 
		int last =0; 
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(i < 3) {
					arr[i][j] = (int)(Math.random() * 10 +1);
				}
				 
				if(i==0) {
					System.out.print(arr[i][j]);
					first = first + arr[i][j];
				}else if(i==1) {
					System.out.print(arr[i][j]);
					second = second + arr[i][j];
				}else if(i==2) {
					System.out.print(arr[i][j]);
					last = last + arr[i][j];
				}
			}
			System.out.println();
		}
		for(int i=0; i<arr.length; i++) {
			int hap = 0;
			for(int j=0; j<arr[i].length; j++) {
				if(j==3)arr[i][j] = hap;
				else hap += arr[i][j];
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void practice5(){
		System.out.print("행 크기 : ");
		int m = sc.nextInt();
		System.out.print("열 크기 : ");
		int n = sc.nextInt();
		if(!(m > 0 && m<= 10 && n > 0 && n<= 10)) {
			System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			practice5();
			return;
		}
		char ch = 'A';
		char[][]arr = new char[m][n];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				int random = (int)(Math.random() * 25);
				arr[i][j] = (char)(ch + random);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public void practice6(){}
	public void practice7(){}
	public void practice8(){}
	public void practice9(){}
}
