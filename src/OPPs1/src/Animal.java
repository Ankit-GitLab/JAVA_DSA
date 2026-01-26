class Species{
    void fly(){
        System.out.println("flying....");
    }
}

public class Animal extends Species {
    void  eat(){
        System.out.println("Animal is eating.....");
    }
    void sound(){
        System.out.println("making sound tre tre...");
    }

    @Override
    void fly() {
        System.out.println("Not fly..");
    }
}

class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("bark.....");
    }
}
