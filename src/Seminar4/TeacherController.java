package Seminar4;

import java.util.List;

public class TeacherController implements UserController<Teacher>{
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String lastName, String middleName) {
        teacherService.createTeacher(firstName, lastName, middleName);
    }

    public void editTeacher(String firstName, String lastName, String middleName){
        teacherService.editTeacher(firstName, lastName, middleName);
    }
    public List<Teacher> printTeacher(){
        List<Teacher> teacherList = teacherService.printTeacherList();
        teacherView.sendOnConsole(teacherList);
        return teacherList;
    }
}


