package com.extended.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class Employee {
	@NotBlank(message = "name cannot be empty")
	private String employeeName;
	@Email(message = "invalid email id")
	private String email;
	@Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}", message = "password should contain atleast 1 uppercase,1 lowercase,1 special character,1 number and it should be atleast 8 characters")
	private String password;
	private int roleId;

}
