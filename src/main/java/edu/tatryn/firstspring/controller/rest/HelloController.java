package edu.tatryn.firstspring.controller.rest;
import edu.tatryn.firstspring.model.Student;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {
    List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(1,"Bazil","BBV1"),
                    new Student(2,"Peter","BBV1"),
                    new Student(3,"Steaven","BBV1")
            )
    );

    @RequestMapping("/Hello")
    String sayHello(){
        LocalDateTime currentTime = LocalDateTime.now();
        return currentTime.toString();
    }
    @RequestMapping("/student/list")
    List<Student> showStudents(){
        return students;
    }
}
