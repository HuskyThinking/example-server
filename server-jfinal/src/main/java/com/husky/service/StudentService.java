package com.husky.service;

import com.husky.model.Student;
import com.husky.model.base.BaseStudent;

import java.util.List;

public class StudentService extends BaseStudent<Student> {

    public static final StudentService me = new StudentService();

    private Student dao = new Student().dao();

    public void saveStudent(Student student) {
        student.save();
    }

    public void updateStudent(Student student) {
        student.update();
    }

    public List<Student> findStudentById(String id){
        return dao.find("select s_id, s_name, s_birth, s_sex from student where s_id = ?",id);
    }
}
