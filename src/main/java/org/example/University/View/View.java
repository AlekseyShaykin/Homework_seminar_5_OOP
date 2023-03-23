package org.example.University.View;
//
//import org.example.MVS_School.Student;
//import org.example.MVS_School.User;

import org.example.University.GroupService;
import org.example.University.Student;
import org.example.University.Teacher;
import org.example.University.User;

import java.util.ArrayList;
import java.util.List;

public class View {

    public String StudentView(ArrayList<User> students){

        return "Список всех студентов университета: \n"+students.toString();
    }
    public String GroupView(Teacher teacher, ArrayList<Student> students){
        return "УЧЕБНАЯ ГРУППА \n"+teacher.toString()+" Студенты тех групп, которые относятся к преподавателю: \n" + students.toString();
    }


//    public String theListOfGroup(ArrayList<Integer> list){
//        return list.toString();
//    }


    public String ClearListOfGroup(ArrayList<Integer> list){
        return "Список всех групп в университете: "+list.toString();
    }




}
