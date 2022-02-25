package com.werkbliq.datajpa;

import java.util.HashMap;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.core.sym.Name;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.werkbliq.datajpa.repository.BookRepository;
import com.werkbliq.datajpa.repository.CourseRepository;
import com.werkbliq.datajpa.repository.StudentRepository;
import com.werkbliq.datajpa.repository.StudentidcardRepository;
import com.werkbliq.datajpa.service.StudentService;
import com.werkbliq.datajpa.table.Book;
import com.werkbliq.datajpa.table.Course;
import com.werkbliq.datajpa.table.Student;
import com.werkbliq.datajpa.table.Studentidcard;

import java.io.FileReader;
import java.io.InputStream;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class DatajpaApplication {
	public static void main(String[] args) {
		log.info("Application runs");
		SpringApplication.run(DatajpaApplication.class, args);
		
	}

	@Bean
    public CommandLineRunner commandLineRunner(StudentService studentService) {
		
		ObjectMapper objectmapper = new ObjectMapper();
		TypeReference<List<Student>> typeReference = new TypeReference<List<Student>>() {};
		TypeReference<List<Book>> typeReference1 = new TypeReference<List<Book>>() {};
		TypeReference<List<Studentidcard>> typeReference2 = new TypeReference<List<Studentidcard>>() {};
		InputStream inputStream = TypeReference.class.getResourceAsStream("/data/student.json");
		InputStream inputStream1 = TypeReference.class.getResourceAsStream("/data/book.json");
		InputStream inputStream2 = TypeReference.class.getResourceAsStream("/data/studentidcard.json");

		return args -> {
			
			// read json and write to db//
			
			try {
              
              List<Student> student = objectmapper.readValue(inputStream, typeReference);
              log.info("inputStream Student was called");
              studentService.save(student);
              log.info("students saved!");
              
              List<Book> book = objectmapper.readValue(inputStream1, typeReference1);
              log.info("inputStream Book was called");
              studentService.save1(book);
              log.info("books saved!");
              
              List<Studentidcard> studentidcard = objectmapper.readValue(inputStream2, typeReference2);
              log.info("inputStream Studentidcard was called");
              studentService.save2(studentidcard);
              log.info("studentidcards saved!");


				// * If Table does not exist, an exception will be thrown */
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}

		};
	}
	}
