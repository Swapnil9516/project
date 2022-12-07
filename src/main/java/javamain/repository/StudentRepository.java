package javamain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import javamain.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
