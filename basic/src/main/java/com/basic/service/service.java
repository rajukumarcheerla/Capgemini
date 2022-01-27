package com.basic.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.basic.entity.Employee;

@Service
public interface service {
	public List<Employee> getemp();

}
