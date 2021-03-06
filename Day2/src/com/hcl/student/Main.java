package com.hcl.student;

import java.util.Scanner;

public class Main {

	public static void show(Student selected) {
		System.out.println("Student FullName : " + selected.getFirstname() + selected.getLastname());
		System.out.println("Student Age : " + selected.getAge());
		System.out.println("Student Gender : " + selected.getGender());
		float total = selected.getEnglish() + selected.getMaths();
		System.out.println("Student Total : " + total);
		float average = total / 2;
		System.out.println("Student Average : " + average);
		if (selected.getMajor().equals("CS") || selected.getMajor().equals("cs")) {
			System.out.println("The Students Major is CS");
		}

	}

	public static void main(String[] args) {
		int i;
		Student students[] = new Student[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Students : ");
		int n = Integer.parseInt(sc.nextLine());
		for (i = 1; i <= n; i++) {
			students[i] = new Student();
			System.out.println("Enter the Student Details: ");
			System.out.println("Enter StudentNumber: ");
			int num = Integer.parseInt(sc.nextLine());
			System.out.println("Enter FirstName: ");
			String firstName = sc.nextLine();
			System.out.println("Enter LastName: ");
			String lastName = sc.nextLine();
			System.out.println("Enter Age: ");
			int age = sc.nextInt();
			System.out.println("Enter Gender: ");
			char gender = sc.next().charAt(0);
			System.out.println("Enter English marks: ");
			float english = sc.nextFloat();
			System.out.println("Enter Maths marks: ");
			float maths = sc.nextFloat();
			sc.nextLine();
			System.out.println("Enter Major: ");
			String major = sc.nextLine();

			students[i].add(num, firstName, lastName, age, gender, english, maths, major);
			sc.close();
		}
		System.out.println("Do you want to select student by 'name' or 'number', please enter :");
		String sel = sc.nextLine();
		if (sel.equals("number")) {
			System.out.println("Enter the Student number you want to select : ");
			int select = Integer.parseInt(sc.nextLine());
			for (i = 1; i <= n; i++) {
				if (students[i].getStudnumber() == select) {
					Student selected = students[i];
					show(selected);
				} else {
					System.out.println("Selected Student not found");
				}
			}
		} else if (sel.equals("name")) {
			System.out.println("Enter the Student FirstName you want to select : ");
			String select = sc.nextLine();
			for (i = 1; i <= n; i++) {
				if (students[i].getFirstname().equals(select)) {
					Student selected = students[i];
					show(selected);
				} else {
					System.out.println("Selected Student not found");

				}
				sc.close();
			}
		}

		/*
		 * Student s1 = new Student(); Student s2 = new Student(); s1.add(1, "Monesh",
		 * "Venkul", 21, 'M', 85, 95, "cs"); s2.add(2, "Tony", "Stark", 23, 'M', 95,
		 * 100, "ee"); s1.name(); s2.name(); s1.gcheck();
		 */

	}

}
