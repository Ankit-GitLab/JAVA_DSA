package OPPS;
class Students{
    String name ;
    private int rno;
    double cgpa;
    void print() { // getter
        System.out.println(name+" "+cgpa+" "+rno);
    }
    int  getRno(){ // getter
        return rno;
    }
    void setRno(int x){ // setter
        rno = x;
    }
}
public class PrivateKeyword {

    public static void main(String[] args) {
        Students s1 = new Students();
        System.out.println(s1.name);
        s1.cgpa = 7.3;
        s1.name = "Ankit";

        s1.print();
        Students s2 = new Students();
        s2.print();
        System.out.println(s1.getRno());
        s1.setRno(246003);
        System.out.println(s1.getRno());
    }
}
