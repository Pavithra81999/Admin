package com.extended.service;

import com.extended.entity.Content;
import com.extended.reponse.FinalResponse;

public interface ContentService {
	public FinalResponse addContent(Content content);

	public FinalResponse getContent(int id);
}
