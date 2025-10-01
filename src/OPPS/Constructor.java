package OPPS;

public class Constructor {
    public static class Car {
        int seats;
        String name;
        double length;
        Car(){ // default Constructor

        }
        Car(int x, String s,  double d){ // default constructor
            seats = x;
            name = s;
            length = d;
        }
        void print(){
            System.out.println(seats+" "+name+" "+length);
        }
    }
    public static int max(int a, int b){
        return Math.max(a,b);
    }
    public static int max(int a, int b, int c){
        return Math.max(a,Math.max(b,c));
    }

    public static void main(String[] args) {
        System.out.println(max(9,4));
        System.out.println(max(1,4, 5));

//        Car c1 = new Car(5, "Kia Sonet",3.99);
//        c1.print();
//        Car c2 = new Car(4, "Lord Alto",4.59);
//        c2.print();
//        Car c3 = new Car();
    }
}
