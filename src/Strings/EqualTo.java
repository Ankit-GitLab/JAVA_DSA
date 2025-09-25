package Strings;

public class EqualTo {
    public static boolean equals(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        for(int i=0; i<=s1.length(); i++){
            if(s1.charAt(i) == s2.charAt(i)) return true;
        }
        return false;
    }
    public static void main(String[] args) {
//        String s1 = "Ankit";
//        String s2 ="Ankit";
//        System.out.println(s1==s2); // because this address is different  ---> true
        String s1 = new String("Ankit");
        String s2 = new String("Ankit");
        System.out.println(s1==s2); // because this address is different  ----> false

        System.out.println(equals(s1,s2));
    }
}
