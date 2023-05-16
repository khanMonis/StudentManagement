package com.javaguides.sms;

import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javaguides.sms.entity.Student;
import com.javaguides.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Student student1=new Student("Monis","Khan","monistk87@gmail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2=new Student("Shahid","Khan","shahidgk07@gmail.com");
		 * studentRepository.save(student2);
		 * 
		 * Student student3=new Student("Zaki","Khan","zakizk47@gmail.com");
		 * studentRepository.save(student3);
		 */

	}

}
