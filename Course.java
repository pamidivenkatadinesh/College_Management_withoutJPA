package com.example.demo.course;

public class Course {
	

	private String name;
	private String id;
	private String TimeRequired;
	
	public Course() {
		
	}
	
	public Course(String name, String id, String TimeRequired) {
		super();
		this.name = name;
		this.id = id;
		this.TimeRequired = TimeRequired;
	}
	

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	

	public String getTimeRequired() {
		return TimeRequired;
	}

	public void setTimeRequired(String TimeRequired) {
		this.TimeRequired = TimeRequired;
	}
}
	
	