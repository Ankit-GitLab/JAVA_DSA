package OPPS;

public class PolyMorphism {
    public static class Dog{
        void speak(){
            System.out.println("Bhau Bhau");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("Meow Meow");
        }
    }
    public static class Lion{
        void speak(){
            System.out.println("GRRR");
        }
    }
    public static class Pikachu{
        void speak(){
            System.out.println("pick pick");
        }
    }
    public static class Human{
        void speak(){
            System.out.println("BSDK");
        }
    }
    public static void main(String[] args) {
        Dog tommy = new Dog();
        Cat c = new Cat();
        Human ankit = new Human();
        Pikachu p = new Pikachu();

        tommy.speak();
        c.speak();
        ankit.speak();
        p.speak();

    }
}
