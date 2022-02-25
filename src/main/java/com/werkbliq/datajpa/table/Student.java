package com.werkbliq.datajpa.table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity(name = "Student")
@AllArgsConstructor
@Data
public class Student {

	@Id
    @GeneratedValue( strategy = GenerationType.AUTO )
	private Long id;
	private String first_name;
	private String last_name;
	private String email;
	private Integer age;
	
	public Student() {
		
	}


}
