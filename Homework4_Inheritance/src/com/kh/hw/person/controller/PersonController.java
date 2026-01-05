package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
		int [] person = new int[2];
		int stCnt1 = 0;
		int emCnt2 = 0;
		for(Student st : s) {
			if(st != null) {
				stCnt1++;
			}
		}
		person[0] = stCnt1;
		for(Employee el : e) {
			if(el != null) {
				emCnt2++;
			}
		}
		person[1] = emCnt2;
		return person;
	}
	public void insertStudent(String name, int age, double height, double weight,
			int grade, String major) {
		for(int i=0; i<s.length; i++) {
			if(s[i] == null) {
				s[i] = new Student(name, age, height, weight, grade, major);
				break;
			}
		}
		
	}
	public Student[] printStudent() {
		return s;
	}
	public void insertEmployee(String name, int age, double height, double weight,
			int salary, String dept) {
		
		for(int i=0; i<e.length; i++) {
			if(e[i] == null) {
				e[i] = new Employee(name, age, height, weight, salary, dept);
				break;
			}
		}
	}
	
	public Employee[] printEmployee() {
		return e;
	}
}
