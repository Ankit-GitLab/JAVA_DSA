public class Student {
    String name;
    int rollNo;
    String section;
    String branch;


    // para
    Student(String name, int rollNo, String section, String branch){
//        this.name = name;
//        this.rollNo = rollNo;
//        this.section = section;
//        this.branch = branch;

    }

    // Method
    void display() {
        System.out.println(name + " " + rollNo + " " + section + " " + branch);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ankit",246003,"A","B.Tech");


        s1.display();

    }

}
