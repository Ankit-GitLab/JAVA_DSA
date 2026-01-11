package Ankit_Java.Strings;

public class PrintAllSubString {
    public static void main(String[] args) {
        String name = "Ankit";
        for(int i=0; i<=name.length(); i++){
            for(int j=i+1; j<=name.length(); j++){
                System.out.print(name.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
