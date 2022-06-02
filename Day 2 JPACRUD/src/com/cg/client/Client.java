package com.cg.client;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;
import  com.cg.entities.Student;

public class Client {

	public static void main(String[] args) {
		StudentService obj=new StudentServiceImpl();
		Student student=new Student();
		
		//create 
		/*student.setStudentId(104);
		student.setName("Afreen");
		obj.addStudent(student);*/
		
		//retrieve
		/*student=obj.findStudentById(101);
		System.out.println("Student Id: "+student.getStudentId());
		System.out.println("Student Name: "+student.getName());*/
		
		/*//update
		student=obj.findStudentById(101);
		student.setName("Hritik Jain");
		obj.updateStudent(student);*/
		
		//delete
		student=obj.findStudentById(101);
		obj.removeStudent(student);

	}

}