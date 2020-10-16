package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.model.Employee;

public class ReadApplication2 {

	public static void main(String[] args) {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("com/config/hibernate.cfg.xml")
				.build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction(); // commit & rollback

		Employee obj = session.get(Employee.class, 11);
		if (obj != null) {
			System.out.println(obj.getEmpNo());
			System.out.println(obj.getEmpName());
			System.out.println(obj.getSalary());

			// update
			System.out.println("Employee update");
			obj.setEmpName("updatedemo name");
			session.delete(obj);
			// session.update(obj); // session.save(), session.update()
			transaction.commit();
		} else {
			System.out.println("No such Employee");
		}

		System.out.println(" updated successfully saved");
		session.close();
		factory.close();
	}

}
