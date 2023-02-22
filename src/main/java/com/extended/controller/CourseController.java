package com.extended.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.extended.entity.Course;
import com.extended.reponse.FinalResponse;
import com.extended.service.CourseService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	private CourseService courseService;

	@PostMapping("/add")
	public FinalResponse addCourse(@RequestBody @Valid Course course) {
		return courseService.addCourse(course);
	}
}
