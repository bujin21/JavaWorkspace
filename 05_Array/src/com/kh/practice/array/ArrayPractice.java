package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);
	public void practice1(){
		
		int[] arr = new int[10];
		//0=10
		//1=9
		//2=8
		//..
		//10=0
		//10 9 8 7 6 ... 1
		int num = arr.length;
		for(int i = 0; i<arr.length; i++) {
			arr[i] = num;
			num--;
			System.out.print(arr[i]+" ");
		}
	}
	public void practice2(){
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		int[] arr= new int[num];
		for(int i = 0; i<num;i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+ " ");
		}
	}
	public void practice3(){
		int[] arr = new int[10];
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 +1);
			System.out.print(arr[i] + " ");
		}
	}
	public void practice4(){
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		String[] str = {"월","화","수","목","금","토","일"};
		if(num > str.length -1 && num < 0) System.out.println("\n잘못 입력하셨습니다.");
		
		System.out.print(str[num]+"요일");
	}
	public void practice5(){
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		int hap = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			int n = sc.nextInt();
			arr[i] = n;
			hap = hap +(arr[i]);
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print( arr[i]+" ");
		}
		System.out.println("\n총합 : "+ hap);
	}
	public void practice6(){
		System.out.print("문자열 : ");
		String str = sc.next();
		char[] arr = str.toCharArray();
		int cnt = 0;
		
		for(int i=0; i<arr.length; i++) {
			char ch = arr[i]; //중복인지 검사
			//문자 중복 검사
			// 현재 위치에서 암쪽의 단어들 중 현재단어와 일치하는 값이 있는지 확인
			boolean isDup = false;
			for(int j =0; j<i; j++) {
				if(ch == arr[j]) {
					//중복
					isDup = true;
					break;
				}
				
			}
			if(!isDup) {
				System.out.print(ch+(i == arr.length-1?" ":", "));
				cnt++;
			}
			
		}
		System.out.println("\n문자 개수 : "+cnt);
		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i; j<arr.length-i; j++) {
//				if(arr[i] == arr[j])cnt++;
//			}
//			System.out.print(arr[i]+ (i == arr.length-1?" ":", "));
//		}
//		System.out.println("\n문자 개수 : "+cnt);
	}
	public void practice7(){
		System.out.print("문자열 : ");
		String str = sc.next();
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		char[] arr = str.toCharArray();
		int cnt = 0;
		System.out.print(str+"에 "+ch+"가 존재하는 위치(인덱스) : ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == ch) { 
				cnt++;
				System.out.print(i+" ");
			}
		}
		System.out.print("\n"+ch+" 개수 : "+cnt);
		
	}
	public void practice8(){
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.next();
		char[] origin = str.toCharArray();
		char [] copy = Arrays.copyOf(origin, origin.length);
		for(int i=8; i<origin.length; i++) {
			origin[i] = '*';
		}
		for(int i=8; i<copy.length; i++) {
			System.out.print(copy[i]);
		}
	}
	public void practice9(){
		int[] arr = new int[10];
		int bNum = arr.length / 2;
		int sNum = bNum;
		//작은거부터 비교해서 작으면 sNum에 넣고 아니면 bNum과 비교해서 그면 값을 넣기
//		for(int i =0; i<arr.length; i++) {
//			arr[i] = (int)(Math.random() * 10 +1);
//			if(sNum > arr[i]) {
//				sNum = arr[i];
//			}else if(bNum < arr[i]) {
//				bNum = arr[i];
//			}
//			System.out.print(arr[i] + " ");
//		}
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 +1);
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		//최대값, 최소값
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 1; i<arr.length; i++) {
			if(arr[i]> max) {
				max = arr[i];
			}
			if(arr[i]< min) {
				min = arr[i];
			}
		}
		System.out.println("\n최대값 : "+max);
		System.out.println("최소값 : "+min);
		
	}
	public void practice10(){
		int[] arr = new int[10];
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 +1);
			for(int j=0; j<i; j++) {
				//중복검사
				if(arr[j] == arr[i]) {
					i--;
					break;
				}
				
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public void practice11(){
		System.out.print("정수 : ");
		int num = sc.nextInt();
		if(!(num >= 3 && num % 2 ==1)) {
			System.out.println("다시 입력하세요.");
			practice11();
			return;
		}
		int value = 0;
		int [] arr = new int[num];
		int mid = num / 2;
		for(int i=0; i<arr.length; i++) {
			//mid까지는 오름차순
			if(i <= mid) {
				arr[i]= ++value;
			}else {
				//mid이후는 내림차순
				arr[i] = --value;
			}
		}
//		int[] arr = new int[num];
//		int max = num/2 + 1;
//		//12321	5
//		//1234321  7
//		
//		for(int i=0; i<max; i++) {
//			arr[i] = i+1;	
//		}
//		for(int j=0; j<max-1; j++) {
//			arr[max+j] = max-1-j;
//		}
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
	}
	
	public void practice12(){
		
		System.out.print("배열의 크기을 입력하세요. : ");
		int num = sc.nextInt();
		String[] origin = new String[num];
		String[] copy = null;
		
		sc.nextLine();
		
		for(int i=0; i<origin.length; i++) {
			System.out.print((i+1)+"번째 문자열 : ");
			origin[i]= sc.nextLine();//띄어쓰기 포함
			
		}
		while(true) {
			
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.next().charAt(0);
			if(ch == 'y' || ch == 'Y') {
				System.out.print("더 입력하고 싶은 개수 : ");
	            int num2 = sc.nextInt();

	            copy = Arrays.copyOf(origin,origin.length + num2);
	            sc.nextLine();

	            for(int i = origin.length; i < copy.length; i++) {
	                System.out.print((i+1)+"번째 문자열 : ");
	                copy[i] = sc.nextLine();
	            }
	            origin = copy;	
			}else if(ch == 'n' || ch == 'N') {
				System.out.println(Arrays.toString(origin));
	            break;
			}
			
		}

		
	}
}
