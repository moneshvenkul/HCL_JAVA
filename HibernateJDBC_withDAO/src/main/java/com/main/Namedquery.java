package com.main;

import java.util.List;

//import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import com.model.Employee;

public class Namedquery {

	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("com/config/hibernate.cfg.xml")
				.build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Query query = session.getNamedQuery("findEmployeeByName");
		query.setParameter("name", "Hibernate demo 3");

		List<Employee> myList = query.getResultList();

		System.out.println(myList.size());

		for (Employee employee : myList) {
			System.out.println(employee.getEmpName());
			System.out.println(employee.getEmpNo());

		}

		session.close();
		factory.close();

	}

}
