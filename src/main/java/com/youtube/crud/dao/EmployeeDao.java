package com.youtube.crud.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.youtube.crud.entity.Employee;

@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer>{

}
