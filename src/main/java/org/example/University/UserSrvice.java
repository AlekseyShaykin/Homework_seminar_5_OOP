package org.example.University;

import java.util.Date;
import java.util.List;

public class UserSrvice implements DataService{


    @Override
    public User create(Student student) {
        return student;    }

    @Override
    public User create(Teacher teacher) {
        return teacher;
    }

    @Override
    public List<User> read(List<User> users) {
        return users;
    }


    }

