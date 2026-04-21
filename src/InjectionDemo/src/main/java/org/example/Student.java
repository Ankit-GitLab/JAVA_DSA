package org.example;

public class Student {
    public Course course; // course type ka object
    //dependency injection
    //setter injection


    public void setCourse(Course course) {
        this.course = course;
    }

    public Student(){

    }

    public Student(Course course) {
        this.course = course;
    }

    public void study(){
        int start = course.enroll();
        if(start>=1){
            System.out.println("Journey started..");
        }
        else{
            System.out.println("payment failed....");
        }
    }
}
