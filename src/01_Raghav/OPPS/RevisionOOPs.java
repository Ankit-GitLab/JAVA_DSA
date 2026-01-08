package OPPS;
 class Pokemon{
    private int power;
    String type;
    Pokemon(String type, int power){ // setters
        this.power = power;
        this.type = type;
    }
     Pokemon(int power, String type){ // setters
         this.power = power;
         this.type = type;
     }
     Pokemon(){

     }
     int getPower(){
        return power;
     }
    void print(){ //getter
        System.out.println(this.power+" "+this.type);
    }
}
public class RevisionOOPs {

    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Electric",70);
        pikachu.type = "Fire";
        Pokemon ligglypuff = new Pokemon("fairy",50);
        Pokemon gengar = new Pokemon();
        pikachu.print(); ligglypuff.print();
        final int x = 89; // x cannot will be changed

    }
}
