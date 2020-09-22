package com.department;

import java.util.Scanner;

public class EmployeeProcessing {

	Scanner scanner = new Scanner(System.in);

	public Employee[] searchByName(Employee[] employees) {
		Employee[] resultEmployees=new Employee[3];
		int index=0;
		System.out.println("Enter Name of  employee to be searched");
		String employeeName=scanner.nextLine();
		for (int i = 0; i < employees.length; i++) {
			if(employees[i].getEmployeeName().equals(employeeName))
			{
				resultEmployees[index++]=employees[i];
			}
		}
	
		return resultEmployees;
		
	}

	public Employee[] salaryIncrement(Employee[] employees) {

		System.out.println("Enter the salary Increment");
		float salaryIncrement=scanner.nextFloat();
		for (int i = 0; i < employees.length; i++) {
			float salaryIncerementAmount = employees[i].getEmployeeSalary() + salaryIncrement;
			employees[i].setEmployeeSalary(salaryIncerementAmount);
		}

		return employees;

	}
}
