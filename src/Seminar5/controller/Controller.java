package Seminar5.controller;

import Seminar5.model.*;
import Seminar5.service.DataService;
import Seminar5.view.StudentView;
import Seminar5.service.EducationalGroupService;

import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView view = new StudentView();
    private final EducationalGroupService groupService = new EducationalGroupService();

    public void createStudent(String firstName, String lastName, String middleName) {
        service.create(firstName, lastName, middleName, Type.STUDENT);
    }

    public void getAllStudent() {
        List<User> userList = service.getAllStudent();
        for (User user : userList) {
            Student student = (Student) user;
            view.printOnConsole(student);
        }
    }

    public EducationalGroup createAndReturnEducationalGroup (Teacher teacher, List<Student> studentList){
        return groupService.createEducationalGroup(teacher, studentList);
    }
}
