package Ankit_Java.Strings;

public class SumOfSubString {
    public static void main(String[] args) {
        String n = "12345679";
        int count = 0;
        for(int i=0; i<=n.length(); i++){
            for(int j=i+1; j<=n.length(); j++){
                int num = Integer.parseInt(n.substring(i, j));
                count += num;
            }
        }
        System.out.println(count);
    }
}
