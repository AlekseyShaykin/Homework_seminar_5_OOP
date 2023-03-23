package org.example.University.Controller;

import org.example.University.*;
import org.example.University.View.View;

import java.util.ArrayList;
import java.util.Date;



public class Controller {
    public static void main(String[] args) {

        UserSrvice userSrvice = new UserSrvice();


        //  создаем студентов с разными группами
        ArrayList<User> users = new ArrayList<>();
        users.add(userSrvice.create(new Student(new Date(), "Petrov", 10, 35)));
        users.add(userSrvice.create(new Student(new Date(), "Sidorov", 11, 33)));
        users.add(userSrvice.create(new Student(new Date(), "Petrov", 12, 35)));
        users.add(userSrvice.create(new Student(new Date(), "Zorin", 13, 33)));
        users.add(userSrvice.create(new Student(new Date(), "Volkov", 14, 40)));
        users.add(userSrvice.create(new Student(new Date(), "Maslov", 15, 40)));
        users.add(userSrvice.create(new Student(new Date(), "Zverev", 16, 40)));

        // выводим в консоль список всех студентов
        View view = new View();
        System.out.println(view.StudentView(users));

        //создаем список групп для конкретного учителя и создаем экземпляр учителя
        ArrayList<Integer> MarryGroupID = new ArrayList<>();
        MarryGroupID.add(33);
        MarryGroupID.add(35);
        Teacher Marry = new Teacher(new Date(), "Marry Ivanova", 25, MarryGroupID);

        // определяем студентов, которые относятся к конкретному преподавателю (основа - groupID) и выводим в консоль
        System.out.println("__________________");
        GroupService groupService = new GroupService();
        System.out.println(view.GroupView(Marry, groupService.createAllInfo(Marry, users)));


        //создаем список групп для конкретного учителя и создаем экземпляр учителя
        ArrayList<Integer> InnaGroupID = new ArrayList<>();
        InnaGroupID.add(40);
        Teacher Inna = new Teacher(new Date(), "Inna Moskvina", 30, InnaGroupID);



        // определяем студентов, которые относятся к конкретному преподавателю (основа - groupID) и выводим в консоль
        System.out.println("__________________");
        System.out.println(view.GroupView(Inna, groupService.createAllInfo(Inna, users)));


        System.out.println("__________________");

        // создаем список с номерами всех групп, группы повторяются, т.к. перебираются все студенты, в том числе из одних и тех же групп
        GroupService theListOfGroup = new GroupService();
        theListOfGroup.createListOfGroup(users);


//        Set set2 = new HashSet();
//        ArrayList<Integer> ll = new ArrayList<>();
//        for (int i = 0; i < theListOfGroup.createListOfGroup(users).size(); i++) {
//            if (set2.add(theListOfGroup.createListOfGroup(users).get(i))) {
//                ll.add((Integer) theListOfGroup.createListOfGroup(users).get(i));
//            }
//        }
//        System.out.println(ll);

        GroupService clearListOfGroup = new GroupService();
        System.out.println(view.ClearListOfGroup(clearListOfGroup.createClearListOfGroup(theListOfGroup.createListOfGroup(users))));






    }
}
