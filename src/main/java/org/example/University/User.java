package org.example.University;

import java.util.Date;

public abstract class User {

    Date dateBirth;
    String fio;
    int ID;

    public User(Date dateBirth, String fio, int ID) {
        this.dateBirth = dateBirth;
        this.fio = fio;
        this.ID = ID;
    }

    public User() {
    }


}
