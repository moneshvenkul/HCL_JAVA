/**
 * 
 */
package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author mvven
 *
 */
public class DemoMain {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/demo/spring-config.xml");
		Employee employee = (Employee) context.getBean("demo"); // new -- IOC 
		employee.setEmpNo(51886600);
		employee.setEmpName("Monesh");
		System.out.println("Employee Number is : " + employee.getEmpNo());
		System.out.println("Employee Number is : " + employee.getEmpName());
		
		

	}

}
