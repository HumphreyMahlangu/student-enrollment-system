package za.ac.mycput.service;

import org.springframework.stereotype.Service;
import za.ac.mycput.entity.Student;
import za.ac.mycput.repository.StudentRepository;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }
}
