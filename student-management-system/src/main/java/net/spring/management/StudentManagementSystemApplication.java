package net.spring.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.spring.management.entity.Student;
import net.spring.management.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student("Suyog","Malkar","suyog.malkar@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2= new Student("Pintu","Malkar","pintu.malkar@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3= new Student("yash","abc","yash.abc@gmail.com");
//		studentRepository.save(student3);
	}

}
