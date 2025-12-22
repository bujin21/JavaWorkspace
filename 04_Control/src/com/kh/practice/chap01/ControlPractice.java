package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
	/*아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
	*종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.
	*
	*ex.
	1. 입력
	2. 수정
	3. 조회
	4. 삭제
	7. 종료
	메뉴 번호를 입력하세요 : 3
	조회 메뉴입니다.
	*/	
		
	System.out.println("1. 입력\n"+"2. 수정\n"+"3. 조회\n"+"4. 삭제\n"+"7. 종료\n");
	System.out.print("메뉴 번호를 입력하세요 : ");
	int menu = sc.nextInt();
	
//	if(menu == 7) {
//		System.out.println("종료합니다.");
//		return;
//	}
	switch(menu) {
	case 1 :
		System.out.print("입력");
		break;
	case 2 :
		System.out.print("수정");
		break;
	case 3 :
		System.out.print("조회");
		break;
	case 4 :
		System.out.print("삭제");
		break;
	case 7 :
		System.out.print("종료");
		return;
		//메서드 내 어디서는 사용다능
		// 현재 위치에서 메서드를 "종료"시키는 키워드
		//break;
	}
		System.out.println(" 메뉴입니다.");
	
	}
	
	public void practice2(){
	/*
	키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
	짝수가 아니면 “홀수다“를 출력하세요.
	양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
	ex.
	숫자를 한 개 입력하세요 : -8
	양수만 입력해주세요.
	*/
	System.out.print("숫자를 한 개 입력하세요 : ");
	int num = sc.nextInt();
		//양수인지아닌지
		//가드조건문
		// - 조건을 만족하지 않으면 즛기 종료하는 패턴
		if(!(num > 0)) {
			System.out.println("양수만 입력해주세요.");
			return;
		}
		
		//홀수인지 짝수인지
		if( num % 2 == 0) {
			System.out.println("짝수다");
		}else {
			System.out.println("홀수다");
		}
//		if(num > 0) {
//			//홀수인지 짝수인지
//			if( num % 2 == 0) {
//				System.out.println("짝수다");
//			}else {
//				System.out.println("홀수다");
//			}
//		
//		}else {
//			System.out.println("양수만 입력해주세요.");
//		}
		
	}
	
	 public void practice3(){
		/*국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
		합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
		불합격인 경우에는 “불합격입니다.”를 출력하세요
		
		ex 1.		 ex 2.
		국어점수 : 88 국어점수 : 88
		수학점수 : 50 수학점수 : 50
		영어점수 : 40 영어점수 : 45
		불합격입니다. 	국어 : 88
					수학 : 50
					영어 : 45
					합계 : 183
					평균 : 61.0
					축하합니다, 합격입니다!
		*/
		 
		 System.out.print("국어점수 : ");
		 int kor = sc.nextInt();
		 System.out.print("수학점수 : ");
		 int math = sc.nextInt();
		 System.out.print("영어점수 : ");
		 int eng = sc.nextInt();
		 
		 int result = kor + math + eng;
		 double avg = result/3;
		 if(kor > 40 && math > 40 && eng > 40) {
			 System.out.println("국어 : "+kor);
			 System.out.println("수학 : "+math);
			 System.out.println("영어 : "+eng);
			 System.out.println("합계 : "+result);
			 System.out.println("평균 : "+avg);
			 System.out.println("축하합니다, 합격입니다!");
		 }else {
			 System.out.println("불합격입니다.");
		 }
		 
	 }
	 
	 public void practice4(){
		 /*pdf파일 (7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울
		  *  예제를 switch문으로 바꿔서 출력하세요.
		  *  
		  *  ex 1.
			1~12 사이의 정수 입력 : 8
			8월은 여름입니다.
			ex 2.
			1~12 사이의 정수 입력 : 99
			99월은 잘못 입력된 달입니다
		  */
		 System.out.print("1~12 사이의 정수 입력 : ");
		 int month = sc.nextInt();
		 
		 String season = "";
		 switch(month) {
		 case 1, 2 ,12:
			 season = "겨울";
			 break;
		 case 3, 4, 5:
			 season = "봄";
			 break;
		 case 6, 7, 8:
			 season = "여름";
			 break;
		 case 9, 10, 11:
			 season = "가을";
			 break;
		default:
			System.out.println(month+"월은 잘못 입력된 달입니다.");
			return;
		 }
		 System.out.println(month+"월은 "+season+ "입니다.");
	 }
	 
	 public void practice5(){
		 /*
		  * 아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
			로그인 성공 시 “로그인 성공”,
			아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
			비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.
			ex 1. 			ex 2. 				ex 3.
			아이디 : minmin 	아이디 : minmin 		아이디 : min
			비밀번호 : Min1234 비밀번호 : min1234 	비밀번호 : Min1234
			로그인 성공 		비밀번호가 틀렸습니다. 	아이디가 틀렸습니다.
		  * */
		 
		 String realId = "minmin";
		 String realPw = "Min1234";
		 
		 System.out.print("아이디 : ");
		 String id = sc.next();
		 System.out.print("비밀번호 : ");
		 String pw = sc.next();
		 
		 if(id.equals(realId)) {
			 if(pw.equals(realPw)) {
				 System.out.println("로그인 성공");
			 }else {
				 System.out.println("비밀번호가 틀렸습니다.");
			 }
			 
		 }else {
			 System.out.println("아이디가 틀렸습니다.");
		 }
				 
	 }
	 public void practice6(){
		 System.out.print("권한은 확인하고자 하는 회원 등급 : ");
		 String grade = sc.next();
		 
		 switch(grade) {
		 case "관리자" :
			 System.out.println("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회");
			 break;
		 case "회원" :
			 System.out.println("게시글 작성, 댓글 작성, 게시글 조회");
			 break;
		 case "비회원" :
			 System.out.println("게시글 조회");
			 break;
		 }
	 }
	 public void practice7(){
		 System.out.print("키(cm)를 입력해 주세요 : ");
		 double heigth = sc.nextDouble();
		 System.out.print("몸무게(kg)를 입력해 주세요 : ");
		 double weight = sc.nextDouble();
		 
		 double BMI = weight / (heigth*heigth);
		 
		 if(BMI >= 18.5) {
			 System.out.println("BMI 지수 : " + BMI);
			 System.out.println("정상체중");
		 }else if(BMI > 23) {
			 System.out.println("BMI 지수 : " + BMI);
			 System.out.println("과체중체중");
		 }else if(BMI > 25) {
			 System.out.println("BMI 지수 : " + BMI);
			 System.out.println("비만");
		 }else if(BMI > 30) {
			 System.out.println("BMI 지수 : " + BMI);
			 System.out.println("고도비만");
		 }else {
			 System.out.println("BMI 지수 : " + BMI);
			 System.out.println("저체중");
		 }
	 }
	 public void practice8(){
		 System.out.print("피연산자1 입력 : ");
		 int num1 = sc.nextInt();
		 System.out.print("피연산자2 입력 : ");
		 int num2 = sc.nextInt();
		 System.out.print("연산자를 입력(+,-,*,/,%) : ");
		 char operator = sc.next().charAt(0);
		 
		 switch(operator) {
		 case '+':
			 if(num1 < 0 || num2 < 0) {
				 System.out.println("양수를 입력해주세요.");
				 break; 
			 }
			 System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
			 break;
		 case '-':
			 if(num1 < 0 || num2 < 0) {
				 System.out.println("양수를 입력해주세요.");
				 break; 
			 }
			 System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			 break;
		 case '*':
			 if(num1 < 0 || num2 < 0) {
				 System.out.println("양수를 입력해주세요.");
				 break; 
			 }
			 System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
			 break;
		 case '/':
			 if(num1 < 0 || num2 < 0) {
				 System.out.println("양수를 입력해주세요.");
				 break; 
			 }
			 System.out.println(num1 + " / " + num2 + " = " + (num1/(float)num2));
			 break;
		 case '%':
			 if(num1 < 0 || num2 < 0) {
				 System.out.println("양수를 입력해주세요.");
				 break; 
			 }
			 System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
			 break;
		 }
			
		 
	 }
	 public void practice9(){
		 System.out.print("중간 고사 점수 : ");
		 int mScore = sc.nextInt();
		 System.out.print("기말 고사 점수 : ");
		 int hScore = sc.nextInt();
		 System.out.print("과제 점수 : ");
		 int gwa = sc.nextInt();
		 System.out.print("출석 회수 : ");
		 int count = sc.nextInt();
		 
		 double reMScore = mScore * 0.2;
		 double reHScore = hScore * 0.3;
		 double gwaS = gwa * 0.3;
		 double countS = count*1.0;
		 
		 double result = reMScore + reHScore + gwaS + countS;
		 
		 if(result >= 70.0 && ((count/20.0)*100) > 70.0) {
			 System.out.println("================= 결과 =================");
			 System.out.println("중간 고사 점수(20) : "+(int)reMScore);
			 System.out.println("기말 고사 점수(30) : "+(int)reHScore);
			 System.out.println("과제 점수 (30) : "+(int)gwaS);
			 System.out.println("출석 점수 (20) : "+(int)countS);
			 System.out.println("총점 : "+ result);
			 System.out.println("PASS");
		 }else{
			 System.out.println("Fail [출석 회수 부족 ("+count+"/20)]");
		 }
	 }
	 public void practice10(){
		 
		 System.out.println("실행할 기능을 선택하세요.\r\n"
		 		+ "1. 메뉴 출력\r\n"
		 		+ "2. 짝수/홀수\r\n"
		 		+ "3. 합격/불합격\r\n"
		 		+ "4. 계절\r\n"
		 		+ "5. 로그인\r\n"
		 		+ "6. 권한 확인\r\n"
		 		+ "7. BMI\r\n"
		 		+ "8. 계산기\r\n"
		 		+ "9. P/F");
		 System.out.print("선택 : ");
		 int num = sc.nextInt();
		 switch(num) {
		 case 1 : 
			 practice1();
			 break;
		 case 2 : 
			 practice2();
			 break;
		 case 3 : 
			 practice3();
			 break;
		 case 4 : 
			 practice4();
			 break;
		 case 5 : 
			 practice5();
			 break;
		 case 6 : 
			 practice6();
			 break;
		 case 7 : 
			 practice7();
			 break;
		 case 8 : 
			 practice8();
			 break;
		 case 9 : 
			 practice9();
			 break;
		 }
	 }
	 public void practice11(){
		 System.out.print("비밀번호 입력(1000~9999) : ");
		 String pw = sc.next();
		 if(pw.length() != 4) {
			 System.out.println("자리수 안맞음");
			 return;
		 }
		 if(pw.charAt(0) != pw.charAt(1) 
				 && pw.charAt(1) != pw.charAt(2)
				 && pw.charAt(2) != pw.charAt(3) 
				 && pw.charAt(0) != pw.charAt(3)) {  
			 System.out.println("성공");
		 }else {
			 System.out.println("실패");
		 }
	 }
}
