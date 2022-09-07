package com.example.demo.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	private List<Course> courses= new ArrayList<>(Arrays.asList(
			 new Course("btech","341","4years"),
			 new Course("bed","342","2 years"),
			 new Course("bcom","343","30 years")
			 ));
	
	
	
	
	public   List<Course> getallcourses(){
		return courses;
	}
	public Course getcourse(String id) {
		return courses.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	public void addCourse(Course course) {
		courses.add(course);
		
	}
	public void UpdateCourse(Course course, String id) {
		for(int i=0;i<courses.size();i++) {
			Course c= courses.get(i);
			if(c.getId().equals(id)) {
				courses.set(i, course);
				return;
			}
		
		}
		
	}
	public void DeleteCourse(Course course, String id) {
		courses.removeIf(t->t.getId().equals(id));
		
	}

}
