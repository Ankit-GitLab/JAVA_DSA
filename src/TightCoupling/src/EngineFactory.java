public class EngineFactory {
    public static Engine getEngine(String type){
        if(type.equalsIgnoreCase("diesel")){
            return new DieselEngine();
        }
        else if(type.equalsIgnoreCase("pertol")){
            return new PertolEngine();
        }
        else{
            throw new IllegalArgumentException("Invalid engine type");
        }
    }
}
