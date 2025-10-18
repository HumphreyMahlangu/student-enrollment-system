package za.ac.mycput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import  za.ac.mycput.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
