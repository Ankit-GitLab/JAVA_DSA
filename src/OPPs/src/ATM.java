public class ATM {
    private String accountHolderName;
    private double balance;

    ATM(String name, double bal){
        this.accountHolderName = name;
        this.balance = bal;
    }

    public static void main(String[] args) {
        ATM atm = new ATM("Ankit",10000);
        atm.showBal();
    }
    void showBal(){
        System.out.println("Your balance is : "+balance);
    }
}
