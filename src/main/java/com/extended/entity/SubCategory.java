package com.extended.entity;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class SubCategory {
	private String categoryName;
	private MultipartFile categoryDocument;
	private int contentId;
}
