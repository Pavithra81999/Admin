package com.extended.entity;

import jakarta.persistence.Column;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Content {

	@NotBlank
	@Column(columnDefinition = "JSON")
	private String contentDetails;
	private int courseId;

}
