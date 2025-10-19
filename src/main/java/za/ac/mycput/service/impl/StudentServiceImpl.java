package za.ac.mycput.service.impl;

import org.springframework.stereotype.Service;
import za.ac.mycput.entity.Student;
import za.ac.mycput.repository.StudentRepository;
import za.ac.mycput.service.StudentService;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
