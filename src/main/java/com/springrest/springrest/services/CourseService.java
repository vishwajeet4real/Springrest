package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Courses;

public interface CourseService {

	public List<Courses> getCourses();

	public Courses getCourses(long courseId);
	
	
}
