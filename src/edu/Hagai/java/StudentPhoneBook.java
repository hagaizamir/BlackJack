package edu.Hagai.java;

import java.util.ArrayList;

/**
 * Created by Android2017 on 17/02/2017.
 */
//Alphon:
public class StudentPhoneBook {
    //init the list:
    ArrayList<Student> studentList = new ArrayList<>();

    void addStudent(Student s){
        studentList.add(s);
    }

    void addStudent(){
        Student s = new Student();//IO!!!
        studentList.add(s);
    }

    void removeStudent(int index) {
        if (index >= 0 && index < studentList.size()) {
            studentList.remove(index);
        }
        else {
            System.out.println("Index is not valid");
        }
    }

    void showStudent(int index){
        if (index >= 0 && index < studentList.size()) {
            Student s = studentList.get(index);
            s.print();

        }
        else {
            System.out.println("Index is not valid");
        }


    }

    void showAllStudents(){
        for (Student s : studentList) {
            s.print();
        }
    }
    void  menu (){
        System.out.print("1. Add new student\n" +
                "2. Remove a student\n" +
                "3. Print a student\n" +
                "4. Print all students\n"+
        "5. Exit\n");
    }
}