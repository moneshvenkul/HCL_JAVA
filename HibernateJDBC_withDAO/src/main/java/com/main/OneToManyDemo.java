package com.main;

import java.util.ArrayList;
import java.util.List;

//import javax.transaction.HeuristicMixedException;
//import javax.transaction.HeuristicRollbackException;
//import javax.transaction.RollbackException;
//import javax.transaction.SystemException;
//import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.model.Student;
import com.model.Teacher;

public class OneToManyDemo {

	public static void main(String[] args) {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("com/config/hibernate.cfg.xml")
				.build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction transaction;

		Teacher teacher = new Teacher();
		teacher.setTeacherId(100);
		teacher.setTeacherName("First Teacher");

		Student student1 = new Student();
		student1.setStudId(1);
		student1.setSname("First Student Name");
		// student1.setTeacher(teacher);

		Student student2 = new Student();
		student2.setStudId(2);
		student2.setSname("Second Student Name");
		// student2.setTeacher(teacher);

		List<Student> students = new ArrayList();
		students.add(student1);
		students.add(student2);
		teacher.setStudents(students);
		transaction = session.beginTransaction();
		session.save(teacher);
		// session.save(student1);
		// session.save(student2);
		// session.save(students);

		transaction.commit();
		System.out.println("End of One to many");

		session.close();
		factory.close();

	}

}
