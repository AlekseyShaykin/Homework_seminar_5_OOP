package org.example.University;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data

@NoArgsConstructor
public class Group {


    public Teacher teacher;
    public ArrayList<Student> student;


    public Group(Teacher teacher, ArrayList<Student> student) {

        this.teacher = teacher;
        this.student = student;
    }




}
