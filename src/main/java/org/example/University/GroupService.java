package org.example.University;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class GroupService<T> implements GroupServiceInt {


    @Override
    public ArrayList<Student> createAllInfo(Teacher teacher, ArrayList<Student> students) {
        ArrayList<Student> arrayStudentList = new ArrayList<>();
        for (int j = 0; j < teacher.groupID.size(); j++) {

            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).groupID == teacher.groupID.get(j)) {
                    arrayStudentList.add((students.get(i)));

                }
            }
        }

        return arrayStudentList;
//        for(User i: arrayList){
//        System.out.println(i);
    }

    @Override
    public ArrayList<Integer> createListOfGroup(ArrayList<Student> students) {

        ArrayList<Integer> theListOfGroup = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            theListOfGroup.add((students.get(i).groupID));
        }
        return theListOfGroup;
    }

    @Override
    public ArrayList<Integer> createClearListOfGroup(ArrayList<Integer> theListOfGroup) {
        Set set2 = new HashSet();
        ArrayList<Integer> ll = new ArrayList<>();
        for (int i = 0; i < theListOfGroup.size(); i++) {
            if (set2.add(theListOfGroup.get(i))) {
                ll.add((Integer) theListOfGroup.get(i));
            }
        }
        return ll;
    }
}

