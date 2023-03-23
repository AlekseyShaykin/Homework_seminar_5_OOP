package org.example.University;

import java.util.Date;
import java.util.List;

public class Student extends User{


    int groupID;

    List<Integer> grade;

    public Student(Date dateBirth, String fio, int ID) {
        super(dateBirth, fio, ID);
        this.groupID = groupID;
        this.grade = grade;
    }

    public Student() {
    }

    public Student(Date dateBirth, String fio, int ID, int groupID) {
        super(dateBirth, fio, ID);
        this.groupID = groupID;
    }


    @Override
    public String toString() {
        return "Student {" +
                "groupID =" + groupID +
//                ", grade=" + grade +
//                ", dateBirth=" + dateBirth +
                ", fio='" + fio + '\'' +
//                ", ID=" + ID +
                '}'+"\n";
    }
}
