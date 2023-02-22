package com.extended.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extended.entity.Content;
import com.extended.reponse.FinalResponse;
import com.extended.rolerepository.ContentRepository;
import com.extended.service.ContentService;

@Service
public class ContentServiceImpl implements ContentService {

	@Autowired
	private ContentRepository contentRepository;

	@Override
	public FinalResponse addContent(Content content) {
		// TODO Auto-generated method stub
		FinalResponse finalResponse = new FinalResponse();
		contentRepository.saveContent(content);
		finalResponse.setStatus(true);
		finalResponse.setStatusCode("200");
		finalResponse.setMessage("course content added successfully");
		finalResponse.setData(content);
		return finalResponse;
	}

	@Override
	public FinalResponse getContent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
