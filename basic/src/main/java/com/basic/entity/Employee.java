package com.basic.entity;

public class Employee {
	
	private int id;
	private String name;
	private long num;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee(int id, String name, long num) {
		super();
		this.id = id;
		this.name = name;
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}

}
