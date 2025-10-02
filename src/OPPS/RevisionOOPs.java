package OPPS;

public class RevisionOOPs {
    private static class Pokemon{
        int power;
        String type;
        Pokemon(String type, int power){
            this.power = power;
            this.type = type;
        }
    }
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon("Electric",70);

    }
}
