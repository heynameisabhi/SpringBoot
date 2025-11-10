package pkg1.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pkg1.Entity.Student;

@RestController
@RequestMapping("/students")
public class StudentController {

    List<Student> students = new ArrayList<>();

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {
        students.add(student);
        return "Student added: " + student.getName();
    }
    
    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return students;
    }

}
