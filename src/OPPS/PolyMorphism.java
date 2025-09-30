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
        Dog d = new Dog();
        Cat c = new Cat();
        Human h = new Human();
        Pikachu p = new Pikachu();

        d.speak();
        c.speak();
        h.speak();
        p.speak();

    }
}
