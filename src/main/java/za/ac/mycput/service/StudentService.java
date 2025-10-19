package za.ac.mycput.service;

import za.ac.mycput.entity.Student;
import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);
}
