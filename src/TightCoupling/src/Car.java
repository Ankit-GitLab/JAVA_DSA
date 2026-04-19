public class Car {
    PertolEngine engine = new PertolEngine();

    public void drive(){
        engine.start();
        System.out.println("car is moving....");
    }
}
