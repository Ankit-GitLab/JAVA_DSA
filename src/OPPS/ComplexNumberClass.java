package OPPS;
class ComplexNumber{
    int x;
    int y;
    ComplexNumber(int x, int y){
        this.x = x;
        this.y = y;
    }
    void print(){
        if(y>=0) System.out.println(x+" + "+y+"i");
        else System.out.println(x+" - "+(-y)+"i");
    }
}

public class ComplexNumberClass {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(2, -5);
        ComplexNumber z2 = new ComplexNumber(3, 4);

        z1.print(); z2.print();
    }
}
