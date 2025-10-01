package OPPS;

public class Constructor {
    public static class Car {
        int seats;
        String name;
        double length;
        Car(int x, String s,  double d){ // default constructor
            seats = x;
            name = s;
            length = d;
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car(5, "Kia Sonet",3.99);
        System.out.println(c1.name);
    }
}
