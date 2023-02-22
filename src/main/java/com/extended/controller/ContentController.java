package com.extended.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.extended.entity.Content;
import com.extended.reponse.FinalResponse;
import com.extended.service.ContentService;

@RestController
@RequestMapping("/content")
public class ContentController {
	@Autowired
	private ContentService contentService;

	@PostMapping("/add")
	public FinalResponse addContent(@RequestBody Content content) {

		return contentService.addContent(content);
	}
}
