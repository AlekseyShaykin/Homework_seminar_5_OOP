package org.example.University;

import java.util.ArrayList;
import java.util.List;

public interface GroupServiceInt {


    public ArrayList<Student> createAllInfo (Teacher teacher, ArrayList<Student> students);


    ArrayList<Integer> createListOfGroup(ArrayList<Student> students);

    ArrayList<Integer> createClearListOfGroup(ArrayList<Integer> theListOfGroup);
}
