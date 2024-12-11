package Seminar4;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TeacherService{
    private List<Teacher> teacherList;


    public void createTeacher(String firstName, String lastName, String middleName){
        teacherList.add(new Teacher(firstName, lastName, middleName));
    }
    public void editTeacher (String firstName, String lastName, String middleName){
        Iterator<Teacher> iterator = teacherList.iterator();
        while (iterator.hasNext()){
            Teacher teacher= iterator.next();
            if (teacher.getFirstName().equals(firstName) && teacher.getLastName().equals(lastName) && teacher.getMiddleName().equals(middleName)) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите новое имя:");
                String newFirstName = scanner.next();
                System.out.println("Введите новую фамилию:");
                String newLastName = scanner.next();
                System.out.println("Введите новое отчество:");
                String newMiddleName = scanner.next();
                teacher.setFirstName(newFirstName);
                teacher.setLastName(newLastName);
                teacher.setMiddleName(newMiddleName);
            }
        }
    }
    public List<Teacher> printTeacherList(){
        return teacherList;
    }

}
