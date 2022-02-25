package com.werkbliq.datajpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.werkbliq.datajpa.table.Course;


	public interface CourseRepository extends CrudRepository<Course, Long> {

		}
	
