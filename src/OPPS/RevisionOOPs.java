package OPPS;

public class RevisionOOPs {
    private static class Pokemon{
        int hp;
        int speed;
        int attack;
        int defense;
        String type;
        String name;
    }
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon();
        p1.name = "Pikachu"; p1.type = "Electric"; p1.attack = 70;
        Pokemon p2 = new Pokemon() ;
        p2.name = "Charizard"; p2.type = "fire"; p1.attack = 110;
        Pokemon p3 = p1; // p3 is shallow copy of p1 (can control)
        p3.type = "Water";
        System.out.println(p1.type);
    }
}
