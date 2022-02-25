package com.werkbliq.datajpa.table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;


@Entity(name = "Book")
@AllArgsConstructor
@Data
public class Book {

	@Id
	 @GeneratedValue( strategy = GenerationType.AUTO )
	private Long id;
	private int student_id;
	private String book_name;

	public Book() {
		
	}


}

