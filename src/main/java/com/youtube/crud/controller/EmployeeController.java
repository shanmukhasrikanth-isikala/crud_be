package com.youtube.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.youtube.crud.entity.Employee;
import com.youtube.crud.service.EmployeeService;

@RestController
@CrossOrigin("*")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
	@GetMapping("/get/employees")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/get/employee/{employeeId}")
	public Employee getEmployeeById(@PathVariable Integer employeeId) {
		return employeeService.getEmployeeDetails(employeeId);
	}
	
	@DeleteMapping("/delete/{employeeId}")
	public void deleteEmployee(@PathVariable Integer employeeId) {
		employeeService.deleteEmployee(employeeId);
	}
	
	@PutMapping("/update/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
}
