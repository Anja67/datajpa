package com.werkbliq.datajpa.table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity(name = "studentidcard")
@AllArgsConstructor
@Data
public class Studentidcard {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private Long id;
	private int student_id;
	private String card_number;
    
	public Studentidcard() {
		
	}
	
}
