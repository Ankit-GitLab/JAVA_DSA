package OPPS;
class Students{
    String name ;
    private int rno;
    double cgpa;
    private void print() {
        System.out.println(name+" "+cgpa+" "+rno);
    }
    public void p(){
        print();
    }
}
public class PrivateKeyword {

    public static void main(String[] args) {
        Students s1 = new Students();
        System.out.println(s1.name);
        s1.cgpa = 7.3;
        s1.name = "Ankit";
        // s1.rno = 12;
        s1.p();
        Students s2 = new Students();
        s2.p();
    }
}
