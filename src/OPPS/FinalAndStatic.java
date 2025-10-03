package OPPS;

class Cricketer{
    static String country = "India";
    int runs;
    String name;
    double avg;
}
public class FinalAndStatic {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer() ;
        System.out.println(c1.country);
    }
}
