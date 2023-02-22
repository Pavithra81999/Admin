package com.extended.repositoryimpl;

import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.extended.entity.Content;
import com.extended.rolerepository.ContentRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
public class ContentRepositoryImpl implements ContentRepository {

	@Autowired
	private EntityManager entityManager;

	@Override
	@Transactional
	public Content saveContent(Content content) {
		// TODO Auto-generated method stub
		Query query = entityManager.createNativeQuery("insert into content(contentdetails,courseid) values(?,?)");

		ObjectMapper mapper = new ObjectMapper();
		TypeReference<Content> reference = new TypeReference<Content>() {
		};
		InputStream stream = TypeReference.class.getResourceAsStream("");

		try {
			Content content1 = mapper.readValue(stream, reference);
			query.setParameter(1, content1);
			query.setParameter(2, content.getCourseId());
			query.executeUpdate();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return content;

	}

	@Override
	public Object getContent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
