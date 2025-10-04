package OPPS;
class ComplexNumber{
    int x;
    int y;
    ComplexNumber(int x, int y){
        this.x = x;
        this.y = y;
    }
    ComplexNumber(){

    }
    void print(){
        if(y>=0) System.out.println(x+" + "+y+"i");
        else System.out.println(x+" - "+(-y)+"i");
    }

    void add(ComplexNumber z2) {
        x += z2.x;
        y += z2.y;
    }
}

public class ComplexNumberClass {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(2, -5);
        ComplexNumber z2 = new ComplexNumber(3, 4);

        z1.print(); z2.print();
        z1.add(z2);
        z2.print();
    }
}
