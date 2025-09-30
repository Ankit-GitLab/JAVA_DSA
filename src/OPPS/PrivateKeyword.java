package OPPS;
class Students{
    String name ;
    private int rno;
    double cgpa;
}
public class PrivateKeyword {

    public static void main(String[] args) {
        Students s1 = new Students();
        System.out.println(s1.name);
        s1.cgpa = 7.3;
        s1.name = "Ankit";
        // s1.rno = 12;
    }
}
