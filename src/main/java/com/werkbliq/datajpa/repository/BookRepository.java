package com.werkbliq.datajpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.werkbliq.datajpa.table.Book;

	public interface BookRepository extends CrudRepository<Book, Long> {
	
		}
			

