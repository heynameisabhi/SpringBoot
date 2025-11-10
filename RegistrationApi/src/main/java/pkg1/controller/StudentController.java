package pkg1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pkg1.entity.student;
import pkg1.repo.StudentRepo;

import java.util.List;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "*") // So it works if you connect a frontend later
public class StudentController {

    @Autowired
    private StudentRepo studentRepository;

    @PostMapping("/add")
    public String registerStudent(@RequestBody student students) {
        studentRepository.save(students);
        return "Student registered successfully: " + students.getName();
    }

    @GetMapping("/all")
    public List<student> getAllStudents() {
        return studentRepository.findAll();
    }
}
