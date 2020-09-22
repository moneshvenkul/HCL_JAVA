package com.main;

import java.util.ArrayList;
import java.util.List;

import com.Student;
import com.service.DoubleStream1;
import com.service.Filter;
import com.service.Map;
import com.service.MaxMarks;
import com.service.ParallelStream;
import com.service.Reduce;
import com.service.Sorted;

public class MainApp {

	public static void main(String[] args) {
		
	double marks1[]= {50,60,70};
	double marks[]= {10,20,30};
		Student student=new Student(1,"zaveen", "sukumar", 1, "Male", marks);
		Student student1=new Student(2,"Saveen1", "sukumar1", 2, "Male", marks1);
		
		List<Student> students=new ArrayList<Student>();
		students.add(student);
		students.add(student1);
		
		
		List<Double> doubles=new ArrayList<Double>();
		for (int i = 0; i < marks1.length; i++) {
			doubles.add(marks1[i]);
		}
		DoubleStream1 doubleStream=new DoubleStream1();
		System.out.println("Double Stream Example");
		doubleStream.doubleStream(students);
		
		Filter filter1=new Filter();
		System.out.println("Filter example");
		filter1.filterStream(students);
		Map map1=new Map();
		System.out.println("Map Example");
		map1.map(students);
		MaxMarks maxMarks=new MaxMarks();
		System.out.println("Max Example");
		maxMarks.maxMarks(students);
		System.out.println("Parallel Stream Example");
		ParallelStream parallelStream1=new ParallelStream();
		parallelStream1.parallelStream(doubles);
		System.out.println("Reduce Example");
		Reduce reduce=new Reduce();
		reduce.reduce(students);
		System.out.println("Sorting Example");
		Sorted sorted=new Sorted();
		sorted.sorted(students);
		
	}

}
