package com.extended.entity;

import java.sql.Time;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Course {
	@NotBlank(message = "course name cannot be empty")
	private String courseName;
	private Time duration;
}
