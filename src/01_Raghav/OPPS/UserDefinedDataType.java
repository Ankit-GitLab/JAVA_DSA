package OPPS;

public class UserDefinedDataType {
    public static class Student{ // khudka ek data type bana liya hai
        String name;
        int rno;
        double cgpa;
        void print(){
            System.out.println(name+" "+rno+" "+cgpa);
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student(); // declaration
        s1.name = "Ankit";
        s1.rno = 246003;
        s1.cgpa = 7.1;

        Student s2 = new Student(); // declaration
        s2.name = "Vishal";
        s2.rno = 246045;
        s2.cgpa = 7.1;

        Student s3 = new Student(); // declaration
        s3.name = "Vedant";
        s3.rno = 246023;
        s3.cgpa = 7.1;

        System.out.println(s1. name+ " "+s1.cgpa+" "+s1. rno) ;
        s1.print();
        s2.print();
        s3.print();
    }
}
