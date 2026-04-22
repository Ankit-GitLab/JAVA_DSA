package org.cfs;

public class Car {

    private Engine engine;

    public void drive(){
        int start = engine.start();
        if(start>=1){
            System.out.println("Let's drive");
        }
        else{
            System.out.println("Engine not Started yet...");
        }
    }
}
