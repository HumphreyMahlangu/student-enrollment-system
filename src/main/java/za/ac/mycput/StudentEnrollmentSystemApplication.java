package za.ac.mycput;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import za.ac.mycput.entity.Student;
import za.ac.mycput.repository.StudentRepository;

@SpringBootApplication
public class StudentEnrollmentSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentEnrollmentSystemApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
//        if (studentRepository.count() == 0) {
//            Student student1 = new Student("Humphrey","Mahlangu","humphrey@gmail.com");
//            studentRepository.save(student1);
//
//            Student student2 = new Student("Samkelo","Goda","samkelo@gmail.com");
//            studentRepository.save(student2);
//
//            Student student3 = new Student("John","Sibande","john@gmail.com");
//            studentRepository.save(student3);
//        }

    }
}
