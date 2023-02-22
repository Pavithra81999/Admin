package com.extended.repositoryimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.extended.entity.Course;
import com.extended.rolerepository.CourseRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
public class CourseRepositoryImpl implements CourseRepository {

	@Autowired
	private EntityManager entityManager;

	@Override
	@Transactional
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		Query query = entityManager.createNativeQuery("insert into course(coursename,duration) values(?,?)");
		query.setParameter(1, course.getCourseName());
		query.setParameter(2, course.getDuration());
		query.executeUpdate();
		return course;
	}

}
