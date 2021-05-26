package com.capg.user;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.beans.Student;

public class MainClass {
public static void main(String[] args) {
		
	
		
		// Start Spring Container
		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("Spring.xml");
		
		// Get the Object from Spring 
		
		Student student = (Student)spring.getBean("student");
		
		System.out.println(student);
		System.out.println(student.getCourse());
		
		
		
	}
	
	
	
}
