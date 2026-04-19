package org.example;

public class Student {
    private Course course; // course type ka object
    //dependency injection
    //setter injection


    public void setCourse(Course course) {
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
