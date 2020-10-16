package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.model.Employee;

public class NativeQueryDemo {

	public static void main(String[] args) {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("com/config/hibernate.cfg.xml")
				.build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();

		String nativeQuery = "select * from tablename where empnumber =30";
		List<Employee> listOfEmp = session.createNativeQuery(nativeQuery).addEntity(Employee.class).list();
		for (Employee employee : listOfEmp) {
			System.out.println(employee.getEmpNo());

		}

		session.close();
		factory.close();
	}

}
