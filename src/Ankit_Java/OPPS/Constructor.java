package Ankit_Java.OPPS;

public class Constructor {
    public static class Car {
        int price;
        String name;
        Car(){ // default Constructor
        }
        Car(String name, int price){
            this.name = name;
            this.price = price;
        }
        Car(int x, String s){
            price = x;
            name = s;
        }
        void print(){
            int price = 12;
            System.out.println(this.price+" "+name);
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car(508754, "Kia Sonet");
        c1.print();
        Car c2 = new Car("Lord Alto",47393678);
        c2.print();

    }
}
