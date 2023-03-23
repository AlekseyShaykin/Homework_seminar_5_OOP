package org.example.University;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Teacher extends User {

     int exp;

    ArrayList<Integer> groupID;

    public Teacher(Date dateBirth, String fio, int ID) {
        super(dateBirth, fio, ID);
        this.exp = exp;
        this.groupID = groupID;
    }

    public Teacher() {
    }

    public Teacher(Date dateBirth, String fio, int ID, ArrayList<Integer> groupID) {
        super(dateBirth, fio, ID);
        this.groupID = groupID;
    }

    @Override
    public String toString() {
        return "Teacher {" +
                "Группы преподавателя =" + groupID +
//                ", dateBirth=" + dateBirth +
                ", ФИО преподавателя = " + fio  +
                ", ID=" + ID +
                "}"+"\n";
    }


}
