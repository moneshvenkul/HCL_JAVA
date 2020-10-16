package com.dao;

import java.util.List;

import com.model.Employee;

public interface EmployeeDao {

	public abstract Employee createEmployee(Employee employee);

	public abstract Employee readByEmployeeId(int empId);

	public abstract Employee updateEmployee(Employee employee);

	public abstract int deleteByEmployeeId(int empId);

	public abstract String deleteByEmployeeName(int empName);

	public abstract List<Employee> listAllEmployee();
}
