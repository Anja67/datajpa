package com.werkbliq.datajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.werkbliq.datajpa.repository.BookRepository;
import com.werkbliq.datajpa.repository.StudentRepository;
import com.werkbliq.datajpa.repository.StudentidcardRepository;
import com.werkbliq.datajpa.table.Book;
import com.werkbliq.datajpa.table.Student;
import com.werkbliq.datajpa.table.Studentidcard;


@Service
public class StudentService {
	
	private StudentRepository studentRepository;
	private BookRepository bookRepository;
	private StudentidcardRepository studentidcardRepository;

	@Autowired
	public StudentService(StudentRepository studentRepository, BookRepository bookRepository,
			              StudentidcardRepository studentidcardRepository) {
		this.studentRepository = studentRepository;
		this.bookRepository = bookRepository;
		this.studentidcardRepository = studentidcardRepository;
	}

	
	public Iterable<Student> save(List<Student> student) {
		return studentRepository.saveAll(student);

	}
	
	public Iterable<Book> save1(List<Book> book) {
		return bookRepository.saveAll(book);
	}
	
	
	public Iterable<Studentidcard> save2(List<Studentidcard> studentidcard) {
	 return studentidcardRepository.saveAll(studentidcard);
	}




}
