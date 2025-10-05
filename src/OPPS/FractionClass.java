package OPPS;
class Fraction{
    int num;
    int den;

    Fraction(int num, int den){
        this.den= den;
        this.num= num;
    }
    void print(){
        System.out.println(num+"/"+den);
    }
}
public class FractionClass {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,7);
        f1.print();
    }
}
