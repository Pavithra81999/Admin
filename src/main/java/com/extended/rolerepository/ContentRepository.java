package com.extended.rolerepository;

import com.extended.entity.Content;

public interface ContentRepository {
	public Content saveContent(Content content);

	public Object getContent(int id);
}
