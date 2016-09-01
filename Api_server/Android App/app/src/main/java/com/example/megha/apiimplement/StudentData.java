package com.example.megha.apiimplement;

import java.util.ArrayList;

/**
 * Created by megha on 27/08/16.
 */
public class StudentData {

    public ArrayList<Student> students;
    public static class Student{
        public int id;
        public String name;
        public Student(int id, String name){
            this.id = id;
            this.name = name;
        }
    }

    public StudentData(){
        students = new ArrayList<>();
    }
}
