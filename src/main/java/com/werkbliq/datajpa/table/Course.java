package com.werkbliq.datajpa.table;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity(name = "course")
@Table(name = "course")
@ToString
@EqualsAndHashCode
@Data
public class Course {

    @Id
    @SequenceGenerator(name = "course_sequence", sequenceName = "course_sequence", allocationSize = 1)
	@GeneratedValue(strategy = SEQUENCE, generator = "course_sequence")
    
    @Column(name = "id", updatable = false)
	private Long id;
    @Column(name = "name",nullable = false, columnDefinition = "TEXT" )
	private String name;
    @Column(name = "department", nullable = false, columnDefinition = "TEXT")
	private String department;
    
	public Course() {
		
	}
    

}
