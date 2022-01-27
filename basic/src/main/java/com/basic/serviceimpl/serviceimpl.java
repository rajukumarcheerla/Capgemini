package com.basic.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.basic.entity.Employee;
import com.basic.service.service;

public class serviceimpl implements service {

	@Override
	public List<Employee> getemp() {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> list=new ArrayList<>();
		list.add(new Employee(1, "raju", 99922l));
		list.add(new Employee(2, "santha", 22222l));
		list.add(new Employee(4, "thuu", 22882l));
		list.add(new Employee(1, "ramu", 878222l));
		
		return list;
	}

}
