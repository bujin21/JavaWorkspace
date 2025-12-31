package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	private StudentController ssm = new StudentController();
	
	public StudentMenu() {
		System.out.println("========== 학생 정보 출력 ==========");
		// StudentController에 printStudent()의 반환 값을 통해 학생 정보 출력
		Student[] stds = ssm.printStudent();
		for(Student std : stds) {
			System.out.println(std.inform());
		}
		System.out.println();
		
		System.out.println("========== 학생 성적 출력 ==========");
		// StudentController에 avgScore()를 통해 점수 합계와 평균 출력
		double[] avg = ssm.avgScore();
		System.out.println("학생 점수 합계 : " + (int)avg[0]);
		System.out.println("학생 점수 평균 : " + avg[1]);
		System.out.println();
		
		System.out.println("========== 성적 결과 출력 ==========");
		// 학생의 점수가 CUT_LINE 미만이면 재시험 대상, 이상이면 통과 출력
		for(Student std : stds) {
			System.out.println(std.getName()+"학생은 " + 
		(StudentController.CUT_LINE <= std.getScore() ? "통과입니다." : "재시험 대상입니다." ));
			
			
		}
		
	}
}
