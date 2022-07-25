package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("StudentName :Indhu");
	}

	public void studentDept() {
		System.out.println("Studentdepartment : ESE");
	}

	public void studentId() {
		System.out.println("StudentID : 589642");
	}

	public static void main(String[] args) {

		Student details = new Student();

		//calling methods from the class College
		details.collegeName();
		details.collegeRank();
		details.collegeCode();

		//calling methods from the class Department 

		details.deptName();

		//calling methods from the class Student
		details.studentId();
		details.studentName();
	}

}
