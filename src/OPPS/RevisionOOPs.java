package OPPS;
 class Pokemon{
    private int power;
    String type;
    Pokemon(String type, int power){
        this.power = power;
        this.type = type;
    }
    void print(){
        System.out.println(this.power+" "+this.type);
    }
}
public class RevisionOOPs {

    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Electric",70);
        pikachu.type = "Fire";
        Pokemon ligglypuff = new Pokemon("fairy",50);

        pikachu.print(); ligglypuff.print();
    }
}
