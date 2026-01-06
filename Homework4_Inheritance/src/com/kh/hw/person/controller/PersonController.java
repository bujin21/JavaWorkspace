package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
		int [] person = new int[2];
		int cnt= 0;
		for(Student st : s) {
			if(st != null) {
				cnt++;
			}
		}
		person[0] = cnt;
		
		cnt = 0;
		for(Employee el : e) {
			if(el != null) {
				cnt++;
			}
		}
		person[1] = cnt;
		
		return person;
	}
	public void insertStudent(String name, int age, double height, double weight,
			int grade, String major) {
		Student std = new Student(name, age, height, weight, grade, major);
		for(int i=0; i<s.length; i++) {
			if(s[i] == null) {
				s[i] = std;
				break;
			}
		}
		
	}
	public Student[] printStudent() {
		return s;
	}
	public void insertEmployee(String name, int age, double height, double weight,
			int salary, String dept) {
		Employee emp = new Employee(name, age, height, weight, salary, dept);
		for(int i=0; i<e.length; i++) {
			if(e[i] == null) {
				e[i] = emp;
				break;
			}
		}
	}
	
	public Employee[] printEmployee() {
		return e;
	}
}
