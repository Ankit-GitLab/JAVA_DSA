package org.example;

public class App {
    public static void main(String[] args) {
        Student s = new Student();
        Course course = new DSA();
        s.setCourse(course);
        s.study();
    }
}
