package Heaps;

import java.util.*;

class Student implements Comparable<Student>{
    String name;
    int rno;
    double cgpa;
    Student(String name, int rno, double cgpa){
        this.name = name;
        this.rno = rno;
        this.cgpa = cgpa;
    }
    public int compareTo(Student s){
        return this.rno - s.rno;
    }
}
public class CustomComparator {
    public static void main(String[] args) {
        Student s1 = new Student("Ankit", 246003, 7.4);
        Student s2 = new Student("Sharma", 246053, 8.4);
        Student s3 = new Student("Daksha", 246004, 4.4);
        Student s4 = new Student("Dharmendra", 248453, 9.4);
        Student s5 = new Student("Nilu", 246005, 5.4);

        Student[] arr = {s1,s2,s3,s4,s5};
        Arrays.sort(arr);
        for(Student s : arr){
            System.out.print(s.name+"  ");
        }
    }
}
