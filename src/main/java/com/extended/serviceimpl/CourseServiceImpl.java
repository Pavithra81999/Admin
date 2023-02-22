package com.extended.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extended.entity.Course;
import com.extended.reponse.FinalResponse;
import com.extended.rolerepository.CourseRepository;
import com.extended.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;

	@Override
	public FinalResponse addCourse(Course course) {
		// TODO Auto-generated method stub
		FinalResponse finalResponse = new FinalResponse();
		courseRepository.addCourse(course);
		finalResponse.setStatus(true);
		finalResponse.setStatusCode("200");
		finalResponse.setMessage("course added successfully");
		finalResponse.setData(course);
		return finalResponse;
	}

}
