package OPPS;

class Cricketer{
    static String country = "NZ";
    int runs;
    String name;
    double avg;
    void print(){
        System.out.println(runs+" "+name+" "+avg);
    }
    static void greet(){
        System.out.println("I only believe in jassi bhai");
    }
}
public class FinalAndStatic {
    public static void main(String[] args) {
        Cricketer.greet();
        System.out.println(Cricketer.country);
//        Cricketer c1 = new Cricketer() ;
//        System.out.println(c1.country);
//        Cricketer c2 = new Cricketer() ;
//        System.out.println(c2.country);
//        c1.country = "india";
//        System.out.println(c2.country);
    }
}
