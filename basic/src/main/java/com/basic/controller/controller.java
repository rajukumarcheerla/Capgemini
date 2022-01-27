package com.basic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basic.entity.Employee;
import com.basic.repository.repo;
import com.basic.service.service;

@RestController
public class controller {
	/*
	 * @Autowired private service ser;
	 */
	 
	@RequestMapping("/name")
	
	public String getName() {
		return "raju";
	}
	/*
	 * @GetMapping("/all") public List<Employee> getEmp(){ List<Employee>
	 * list=ser.getemp(); list.toString(); return list; }
	 */
	

}
