package net.spring.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.spring.management.entity.Student;



public interface StudentRepository extends JpaRepository<Student, Long>{
	
}
