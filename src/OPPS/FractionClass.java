package OPPS;

import java.util.function.Function;

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
    void add(Fraction f){
        num = num * f.den + den * f.num;
        den = den * f.den;
    }
    void multiple(Fraction f){
        num *= f.num;
        den *= f.den;
    }
}
public class FractionClass {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,7);
        f1.print();
        Fraction f2 = new Fraction(7, 3);
//        f1.add(f2);
//        f1.print();
        f1.multiple(f2);
        f1.print();
    }
}
