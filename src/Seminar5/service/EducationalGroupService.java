package Seminar5.service;

import Seminar5.model.EducationalGroup;
import Seminar5.model.Student;
import Seminar5.model.Teacher;

import java.util.List;

public class EducationalGroupService {

    public EducationalGroup createEducationalGroup(Teacher teacher, List<Student> studentList){
        return new EducationalGroup(teacher, studentList);
    }
}