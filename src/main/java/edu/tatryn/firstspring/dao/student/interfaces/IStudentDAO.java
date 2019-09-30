package edu.tatryn.firstspring.dao.student.interfaces;

import edu.tatryn.firstspring.model.Student;

import java.util.List;

public interface IStudentDAO {
    Student create(Student student);
    Student get(int id);
    Student update(Student student);
    Student delete(int id);
    List<Student> getAll();
}
