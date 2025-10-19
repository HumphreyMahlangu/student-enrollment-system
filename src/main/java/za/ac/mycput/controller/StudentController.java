package za.ac.mycput.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import za.ac.mycput.service.StudentService;

@Controller
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String listAllStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students"; // This matches students.html in templates/
    }
}
