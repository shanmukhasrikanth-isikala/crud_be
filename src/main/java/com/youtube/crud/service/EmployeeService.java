package com.youtube.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youtube.crud.dao.EmployeeDao;
import com.youtube.crud.entity.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	public Employee saveEmployee(Employee employee) {
		return employeeDao.save(employee);
	}
	
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		employeeDao.findAll().forEach(employees::add);
		return employees;
	}

	public Employee getEmployeeDetails(Integer employeeId) {
		return employeeDao.findById(employeeId).orElseThrow();
	}
	
	public void deleteEmployee(Integer employeeId) {
		employeeDao.deleteById(employeeId);
	}
	
	public Employee updateEmployee(Employee employee) {
		employeeDao.findById(employee.getEmployeeId()).orElseThrow();
		return employeeDao.save(employee);
	}
}
