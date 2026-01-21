public class Car {

    //field, attributes, properties
    String color;
    String brand;
    int speed; // instance variable



    public static void main(String[] args) {
        Car car1 = new Car();
        car1.run();

        //we need to set speed value
        car1.speed = 100;
        car1.run();
    }
    //behaviour(method) //action
    public void run(){

        System.out.println("Car is running "+speed);
    }
}
