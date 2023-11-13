package com.app.service;

import com.app.dto.CreateNewCourse;

public interface CourseService {

	String launchNewCourse(CreateNewCourse c);
	String updateCourseFees(Long id, double fee);
}
